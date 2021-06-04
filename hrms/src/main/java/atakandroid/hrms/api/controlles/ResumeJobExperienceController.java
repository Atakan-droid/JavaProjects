package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.ResumeJobExperienceService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeJobExperience;

@RestController
@RequestMapping("/api/resumejobexperiences")
public class ResumeJobExperienceController {
	
	private ResumeJobExperienceService resumeJobExperienceservice;

	@Autowired
	public ResumeJobExperienceController(ResumeJobExperienceService resumeJobExperienceservice) {
		super();
		this.resumeJobExperienceservice = resumeJobExperienceservice;
	}
	@GetMapping("/getall")
	public DataResult<List<ResumeJobExperience>> getAll() {
		return this.resumeJobExperienceservice.getAll();
	}

	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeJobExperience resumeJobExperience) {
		return this.resumeJobExperienceservice.add(resumeJobExperience);
	}
	@PostMapping("/update")
	public Result update(@RequestBody ResumeJobExperience resumeJobExperience) {
		return this.resumeJobExperienceservice.update(resumeJobExperience);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.resumeJobExperienceservice.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ResumeJobExperience> getById(int Id) {

		return this.resumeJobExperienceservice.getById(Id);

	}
	@GetMapping("/getbyresumeid")
	public DataResult<List<ResumeJobExperience>> getByResumeId(int id) {

		return this.resumeJobExperienceservice.getAllByResume_Id(id);

	}

}
