package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Employers;

public interface EmployerService {

	DataResult<List<Employers>> getAll();
	Result add(Employers employer);
}
