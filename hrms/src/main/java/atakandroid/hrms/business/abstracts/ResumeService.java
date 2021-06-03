package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Resume;

public interface ResumeService {

	DataResult<List<Resume>> getAll();
	
	Result add(Resume resume);
}
