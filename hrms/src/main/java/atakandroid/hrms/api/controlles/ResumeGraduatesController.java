package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.ResumeGraduateService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Graduate;

@RestController
@RequestMapping("/api/resume_graduates")
public class ResumeGraduatesController {

	private ResumeGraduateService resumeGraduateService;
	
	public ResumeGraduatesController(ResumeGraduateService resumeGraduateService) {
		this.resumeGraduateService=resumeGraduateService;
	}
	@GetMapping("/getall")
	public DataResult<List<Graduate>> getAll() {

		return this.resumeGraduateService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Graduate graduate) {

		return this.resumeGraduateService.add(graduate);
	}
}
