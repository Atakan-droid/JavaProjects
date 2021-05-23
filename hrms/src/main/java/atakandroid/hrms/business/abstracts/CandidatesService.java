package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Candidates;


public interface CandidatesService {

	DataResult<List<Candidates>> getAll();
	Result add(Candidates candidates);
}
