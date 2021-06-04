package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Graduate;

public interface ResumeGraduateService {

	DataResult<List<Graduate>> getAll();
	
	Result add(Graduate graduate);
	
	Result update(Graduate graduate);
	Result delete(int id);
	
	DataResult<Graduate> getById(int id);
	
	DataResult<List<Graduate>> getAllByResume_Id(int id);
}
