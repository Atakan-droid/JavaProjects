package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.JobPosition;

public interface JobService {

	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition job);
}
