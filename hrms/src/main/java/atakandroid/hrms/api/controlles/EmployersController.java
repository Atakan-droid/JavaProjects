package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.EmployerService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	@Autowired
	private EmployerService employerService;

	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;

	}

	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll() {

		return this.employerService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Employers employer) {

		return this.employerService.add(employer);

	}

}
