package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.JobService;
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
	public List<Job> getAll() {
		
		return this.jobdao.findAll();
	}
	@Override
	public void add(Job job) {
		
		this.jobdao.save(job);
		
	}

}
