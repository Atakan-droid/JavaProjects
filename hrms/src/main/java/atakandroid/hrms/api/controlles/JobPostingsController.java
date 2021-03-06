package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.JobPostingService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/jobpostings")
public class JobPostingsController {

	@Autowired
	JobPostingService jobPostingService;

	public JobPostingsController(JobPostingService jobPostingService) {
		this.jobPostingService = jobPostingService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll() {
		return this.jobPostingService.getAll();
	}

	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}

	@GetMapping("/getactivesbyemployerid")
	public DataResult<List<JobPosting>> getActivesByEmployerId(int employerId) {

		return this.jobPostingService.getActivesByEmployers_EmployerId(employerId);

	}
	@GetMapping("/getactivejobpositions")
	public DataResult<List<JobPosting>> getActiveJobPositions() {

		return this.jobPostingService.getAllActives();

	}
	@GetMapping("/getsorteddate")
	public DataResult<List<JobPosting>> getSortedDate() {

		return this.jobPostingService.getAllActivesDateSorted();

	}
	@PostMapping("/chancestatus")
	public Result updateStatus(int jobPostingId) {

		return this.jobPostingService.updateStatus(jobPostingId);

	}

}
