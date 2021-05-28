package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.UserService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.entities.concretes.Candidate;
import atakandroid.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	private UserService userService;

	public UsersController(UserService userService) {

		this.userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>> getAll() {

		return this.userService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody User user) {

		return this.userService.add(user);

	}

}
