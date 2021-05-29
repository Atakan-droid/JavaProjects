package atakandroid.hrms.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atakandroid.hrms.business.abstracts.SystemEmployeeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.SystemEmployee;

@RestController
@RequestMapping("/api/systememployees")
public class SystemEmployeesController {

	@Autowired
	SystemEmployeeService systemEmployeeService;
	
	public SystemEmployeesController(SystemEmployeeService systemEmployeeService) {
		super();
		this.systemEmployeeService=systemEmployeeService;
	}

	@GetMapping("/getall")
	public DataResult<List<SystemEmployee>> getAll(){
		
		return this.systemEmployeeService.getAll();
	}
	@PostMapping("/add")
	public Result add(SystemEmployee systemEmployee) {
		
		return this.systemEmployeeService.add(systemEmployee);
	}
}
