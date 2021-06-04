package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.ResumeTechnologyService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeTechnology;

@RestController
@RequestMapping("/api/resumetechnologies")
public class ResumeTechnologyController {

	private ResumeTechnologyService resumeTechnologyService;

	@Autowired
	public ResumeTechnologyController(ResumeTechnologyService resumeTechnologyService) {
		super();
		this.resumeTechnologyService = resumeTechnologyService;
	}
	@GetMapping("/getall")
	public DataResult<List<ResumeTechnology>> getAll() {
		return this. resumeTechnologyService.getAll();
	}

	
	@PostMapping("/add")
	public Result add(@RequestBody ResumeTechnology resumeTechnology) {
		return this.resumeTechnologyService.add(resumeTechnology);
	}
	@PostMapping("/update")
	public Result update(@RequestBody ResumeTechnology resumeTechnology) {
		return this. resumeTechnologyService.update(resumeTechnology);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this. resumeTechnologyService.delete(id);
	}

	@GetMapping("/getbyid")
	public DataResult<ResumeTechnology> getById(int Id) {

		return this.resumeTechnologyService.getById(Id);

	}
	@GetMapping("/getbyresumeid")
	public DataResult<List<ResumeTechnology>> getByResumeId(int id) {

		return this. resumeTechnologyService.getAllByResume_Id(id);

	}
}
