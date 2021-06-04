package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.ResumeEducationService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeEducationDao;
import atakandroid.hrms.entities.concretes.ResumeEducation;
@Service
public class ResumeEducationManager implements ResumeEducationService {

	private ResumeEducationDao resumeEducationDao;
	
	@Autowired
	public ResumeEducationManager(ResumeEducationDao resumeEducationDao) {
		this.resumeEducationDao=resumeEducationDao;
	}
	
	@Override
	public Result add(ResumeEducation resumeEducation) {
		this.resumeEducationDao.save(resumeEducation);
		return new SuccessResult("Başarılı Ekleme");
	}

	@Override
	public Result update(ResumeEducation resumeEducation) {
		this.resumeEducationDao.save(resumeEducation);
		return new SuccessResult("Başarılı Ekleme");
	}

	@Override
	public Result delete(int id) {
		this.resumeEducationDao.deleteById(id);;
		return new SuccessResult("Başarıyla Silindi");
	}

	@Override
	public DataResult<ResumeEducation> getById(int id) {
		return new SuccessDataResult<ResumeEducation>(this.resumeEducationDao.getById(id),"Eğitim Seviyesi Getirildi");
	}

	@Override
	public DataResult<List<ResumeEducation>> getAll() {
		
		return new SuccessDataResult<List<ResumeEducation>>(this.resumeEducationDao.findAll(),"Tüm eğitimleri getirildi");
	}

	@Override
	public DataResult<List<ResumeEducation>> getAllByResume_Id(int id) {
		
		return new SuccessDataResult<List<ResumeEducation>>(this.resumeEducationDao.getByResume(id),"Cv Bilgisine göre getirildi");
	}

}
