package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.CandidatesService;
import atakandroid.hrms.core.services.MernisCheckService;
import atakandroid.hrms.core.utilities.EmailValidator;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.CandidatesDao;
import atakandroid.hrms.entities.concretes.Candidates;

@Service
public class CandidateManager implements CandidatesService {

	
	private CandidatesDao candidatedao;
	private MernisCheckService<Candidates> mernisCheckService;
	@Autowired
	public CandidateManager(CandidatesDao candidatedao, MernisCheckService<Candidates> mernisCheckService) {
		this.candidatedao = candidatedao;
		this.mernisCheckService = mernisCheckService;
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>(this.candidatedao.findAll(), "İş arayanlar Getirildi");
	}

	@Override
	public Result add(Candidates candidates) {

		if (!mernisCheckService.isMernis(candidates)) {
			return new ErrorResult("Kimlik numarası hatalı !");
		} else {
			this.candidatedao.save(candidates);
			return new SuccessResult(
					" İş arayan kullanıcı sisteme eklendi.");
		}

	}

}
