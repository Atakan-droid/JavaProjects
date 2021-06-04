package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.ResumeJobExperienceService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeJobExperienceDao;
import atakandroid.hrms.entities.concretes.ResumeJobExperience;

@Service
public class ResumeJobExperienceManager implements ResumeJobExperienceService {

	private ResumeJobExperienceDao resumeJobExperienceDao;
	
	@Autowired
	public ResumeJobExperienceManager(ResumeJobExperienceDao resumeJobExperienceDao) {
		this.resumeJobExperienceDao=resumeJobExperienceDao;
	}
	@Override
	public DataResult<List<ResumeJobExperience>> getAll() {
		return new SuccessDataResult<List<ResumeJobExperience>>(this.resumeJobExperienceDao.findAll(),"Tüm İş tecrübeleri geldi");
	}

	@Override
	public Result add(ResumeJobExperience resumeJobExperience) {
		this.resumeJobExperienceDao.save(resumeJobExperience);
		return new SuccessResult("Başarılı ekleme");
	}

	@Override
	public Result update(ResumeJobExperience resumeJobExperience) {
		this.resumeJobExperienceDao.save(resumeJobExperience);
		return new SuccessResult("Başarılı Güncelleme");
	}

	@Override
	public Result delete(int id) {
		this.resumeJobExperienceDao.deleteById(id);
		return new SuccessResult("Başarılı Silme");
	}

	@Override
	public DataResult<ResumeJobExperience> getById(int id) {
		return new SuccessDataResult<ResumeJobExperience>(this.resumeJobExperienceDao.getById(id),"Id ye göre getirildi");
	}

	@Override
	public DataResult<List<ResumeJobExperience>> getAllByResume_Id(int id) {
		
		return new SuccessDataResult<List<ResumeJobExperience>>(this.resumeJobExperienceDao.getByResume(id),"Cv ye göre getirildi");
	}

}
