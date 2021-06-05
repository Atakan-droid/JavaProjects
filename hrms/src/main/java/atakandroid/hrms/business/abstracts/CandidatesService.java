package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Candidate;


public interface CandidatesService  {

	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidates);
	DataResult<Candidate> getById(int id);
}
