package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.ResumeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

	private ResumeService resumeService;
	
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService=resumeService;
	}
	@GetMapping("/getall")
	public DataResult<List<Resume>> getAll() {

		return this.resumeService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {

		return this.resumeService.add(resume);

	}

	
}
