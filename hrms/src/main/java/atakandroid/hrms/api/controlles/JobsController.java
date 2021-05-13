package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import atakandroid.hrms.business.abstracts.JobService;
import atakandroid.hrms.entities.concretes.Job;


@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	@Autowired
	private JobService jobService;
	

	public JobsController(JobService jobService) {
		this.jobService=jobService;
		
	}
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		
		return jobService.getAll();
	}
	@PostMapping("/add")
	public void add(Job job){
		
		
		this.jobService.add(job);
		
	}
	

}
