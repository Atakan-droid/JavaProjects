package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.ResumeLanguageService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeLanguage;

@RestController
@RequestMapping("/api/resumelanguages")
public class ResumeLanguageController {

	private ResumeLanguageService resumeLanguageService;

	@Autowired
	public ResumeLanguageController(ResumeLanguageService resumeLanguageService) {
		super();
		this.resumeLanguageService = resumeLanguageService;
	}
	@GetMapping("/getall")
	public DataResult<List<ResumeLanguage>> getAll() {
		return this.resumeLanguageService.getAll();
	}

	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeLanguage resumeLanguage) {
		return this.resumeLanguageService.add(resumeLanguage);
	}
	@PostMapping("/update")
	public Result update(@RequestBody ResumeLanguage resumeLanguage) {
		return this.resumeLanguageService.update(resumeLanguage);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.resumeLanguageService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ResumeLanguage> getById(int Id) {

		return this.resumeLanguageService.getById(Id);

	}
	@GetMapping("/getbyresumeid")
	public DataResult<List<ResumeLanguage>> getByResumeId(int id) {

		return this.resumeLanguageService.getAllByResume_Id(id);

	}
}
