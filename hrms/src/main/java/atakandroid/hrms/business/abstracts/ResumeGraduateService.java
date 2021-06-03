package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.dataAccess.abstracts.ResumeGraduateDao;
import atakandroid.hrms.entities.concretes.Graduate;

public interface ResumeGraduateService {

	DataResult<List<Graduate>> getAll();
	
	Result add(Graduate graduate);
}
