package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.CandidatesService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

	@Autowired
	private CandidatesService candidatesService;

	public CandidatesController(CandidatesService candidatesService) {
		this.candidatesService = candidatesService;

	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll() {

		return this.candidatesService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidates) {

		return this.candidatesService.add(candidates);

	}

}
