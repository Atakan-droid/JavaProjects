package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeJobExperience;

public interface ResumeJobExperienceService {

	DataResult<List<ResumeJobExperience>> getAll();

	Result add(ResumeJobExperience resumeJobExperience);

	Result update(ResumeJobExperience resumeJobExperience);

	Result delete(int id);

	DataResult<ResumeJobExperience> getById(int id);

	DataResult<List<ResumeJobExperience>> getAllByResume_Id(int id);
}
