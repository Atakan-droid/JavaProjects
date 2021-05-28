package atakandroid.hrms.business.concretes;

import java.util.List;

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
	public DataResult<List<JobPosting>> getByEmployers_EmployerId(int employerId) {
		
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByEmployer_EmployerId(employerId),
				"İşletmeye Göre İş İlanları Getirildi");
	}
	@Override
	public DataResult<List<JobPosting>> getAll() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(),"Tüm İş İlanları Getirildi");
	}
	@Override
	public Result add(JobPosting jobPosting) {
		
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("Başarı İlan Ekleme");
	}

}
