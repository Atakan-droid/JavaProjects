package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.ResumeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeDao;
import atakandroid.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao=resumeDao;
		
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(),"Tüm Öz Geçmişler Getirildi");
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Başarılı Öz Geçmiş Eklendi");
	}

	
}
