package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeLanguage;


public interface ResumeLanguageService {

	Result add(ResumeLanguage resumeLanguage);
	Result update(ResumeLanguage resumeLanguage);
	Result delete(int id);
	
	DataResult<ResumeLanguage> getById(int id);
	DataResult<List<ResumeLanguage>> getAll();
	DataResult<List<ResumeLanguage>> getAllByResume_Id(int id);
}
