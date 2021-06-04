package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.ResumeEducationService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeEducation;

@RestController
@RequestMapping("/api/resumeeducations")
public class ResumeEducationController {

	ResumeEducationService resumeEducationService;

	@Autowired
	public ResumeEducationController(ResumeEducationService resumeEducationService) {
		super();
		this.resumeEducationService = resumeEducationService;
	}
	@GetMapping("/getall")
	public DataResult<List<ResumeEducation>> getAll() {
		return this.resumeEducationService.getAll();
	}

	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeEducation resumeEducation) {
		return this.resumeEducationService.add(resumeEducation);
	}
	@PostMapping("/update")
	public Result update(@RequestBody ResumeEducation resumeEducation) {
		return this.resumeEducationService.update(resumeEducation);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.resumeEducationService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ResumeEducation> getById(int Id) {

		return this.resumeEducationService.getById(Id);

	}
	@GetMapping("/getbyresumeid")
	public DataResult<List<ResumeEducation>> getByResumeId(int id) {

		return this.resumeEducationService.getAllByResume_Id(id);

	}

	
}
