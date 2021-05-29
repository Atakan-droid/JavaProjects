package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.JobPostingService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.JobPostingDao;
import atakandroid.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService {

	JobPostingDao jobPostingDao;
	public JobPostingManager(JobPostingDao jobPostingDao) {
		this.jobPostingDao=jobPostingDao;
	}
	@Override
	public DataResult<List<JobPosting>> getActivesByEmployers_EmployerId(int employerId) {
		
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getActivesByEmployer_EmployerId(employerId),
				"İşletmeye Göre İş İlanları Getirildi");
	}
	@Override
	public DataResult<List<JobPosting>> getAll() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(),
				"Tüm Aktif İş İlanları Şirkete Göre Getirildi");
	}
	@Override
	public Result add(JobPosting jobPosting) {
		
		
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("Başarı İlan Ekleme");
	}
	@Override
	public DataResult<List<JobPosting>> getAllActives() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.getAllActives(),
				"Tüm Aktif İş İlanları Getirildi");
	}
	@Override
	public DataResult<List<JobPosting>> getAllActivesDateSorted() {
		
		Sort sort=Sort.by(Direction.ASC,"releaseDate");
		
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(sort)
				,"Başlangıç Tarihine Göre Sıralandı");
		
	}
	@Override
	public Result updateStatus(int jobPostingId) {
		
		JobPosting result=this.jobPostingDao.getById(jobPostingId);
		
		if(result.isStatus()) {
			result.setStatus(false);
			this.jobPostingDao.save(result);
		}else {
			result.setStatus(true);
		 this.jobPostingDao.save(result);
		}
		return new SuccessResult("İlan Aktifliği Değiştirildi");
	}

}
