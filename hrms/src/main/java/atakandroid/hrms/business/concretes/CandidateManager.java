package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.CandidatesService;
import atakandroid.hrms.core.services.MernisCheckService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.CandidatesDao;
import atakandroid.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidatesService {

	
	private CandidatesDao candidatedao;
	private MernisCheckService<Candidate> mernisCheckService;
	@Autowired
	public CandidateManager(CandidatesDao candidatedao, MernisCheckService<Candidate> mernisCheckService) {
		this.candidatedao = candidatedao;
		this.mernisCheckService = mernisCheckService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidatedao.findAll(), "İş arayanlar Getirildi");
	}

	@Override
	public Result add(Candidate candidates) {

		
		if (!mernisCheckService.isMernis(candidates)) {
			return new ErrorResult("Kimlik numarası hatalı !");
		} else {
			
			this.candidatedao.save(candidates);
			return new SuccessResult(
					" İş arayan kullanıcı sisteme eklendi.");
		}
	

	}

	@Override
	public DataResult<Candidate> getById(int id) {
		
		return new SuccessDataResult<Candidate>(this.candidatedao.getById(id),"Getirildi");
	}

}

