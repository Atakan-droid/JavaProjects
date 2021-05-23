package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.CandidatesService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.CandidatesDao;
import atakandroid.hrms.entities.concretes.Candidates;

@Service
public class CandidateManager implements CandidatesService {

	@Autowired
	private CandidatesDao candidatedao;
	
	public CandidateManager(CandidatesDao candidatedao) {
		this.candidatedao=candidatedao;
	}
	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>( this.candidatedao.findAll(),"İş arayanlar Getirildi");
	}

	@Override
	public Result add(Candidates candidates) {
		this.candidatedao.save(candidates);
		 return new SuccessResult("İş arayan kaydedildi");
	}

}
