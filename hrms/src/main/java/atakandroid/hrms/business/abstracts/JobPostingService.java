package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.JobPosting;

public interface JobPostingService {

	DataResult<List<JobPosting>> getActivesByEmployers_EmployerId(int employerId);
	
	DataResult<List<JobPosting>> getAllActives();
	
	DataResult<List<JobPosting>> getAllActivesDateSorted();
	
	DataResult<List<JobPosting>> getAll();
	
	Result add(JobPosting jobPosting);
	
	Result updateStatus(int jobPostingId);
}
