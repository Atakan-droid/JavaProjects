package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.JobService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	@Autowired
	private JobService jobService;

	public JobsController(JobService jobService) {
		this.jobService = jobService;

	}

	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll() {

		return this.jobService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobPosition job) {

		return this.jobService.add(job);
	}

}
