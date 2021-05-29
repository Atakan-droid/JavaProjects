package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {

	DataResult<List<SystemEmployee>> getAll();
	
	Result add(SystemEmployee systemEmployee);
}
