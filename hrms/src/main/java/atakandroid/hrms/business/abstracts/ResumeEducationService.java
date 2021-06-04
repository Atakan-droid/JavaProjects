package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeEducation;

public interface ResumeEducationService {

	Result add(ResumeEducation resumeEducation);
	Result update(ResumeEducation resumeEducation);
	Result delete(int id);
	
	DataResult<ResumeEducation> getById(int id);
	DataResult<List<ResumeEducation>> getAll();
	DataResult<List<ResumeEducation>> getAllByResume_Id(int id);
}
