package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.JobService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.JobDao;
import atakandroid.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	@Autowired
	private JobDao jobdao;
	
	public JobManager(JobDao jobdao) {
		this.jobdao=jobdao;
	}
	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>( this.jobdao.findAll(),"İşler Getirildi");
	}
	@Override
	public Result add(Job job) {
		try {
			this.jobdao.save(job);
			return new SuccessResult("İş kaydedildi");
		}catch (Exception e) {
			return new ErrorResult("Sistemde aynı isime sahip bir pozisyon mevcut");
		}
		
	
		
	}

}
