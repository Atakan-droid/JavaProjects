package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeTechnology;

public interface ResumeTechnologyService {

	Result add(ResumeTechnology resumeTechnology);
	Result update(ResumeTechnology resumeTechnology);
	Result delete(int id);
	
	DataResult<ResumeTechnology> getById(int id);
	DataResult<List<ResumeTechnology>> getAll();
	DataResult<List<ResumeTechnology>> getAllByResume_Id(int id);
}
