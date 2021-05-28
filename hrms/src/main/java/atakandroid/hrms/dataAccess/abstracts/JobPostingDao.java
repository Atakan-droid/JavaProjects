package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import atakandroid.hrms.entities.concretes.JobPosting;


public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

	@Query("From JobPosting where employer.employerId=:employerId and status=true")
	 List<JobPosting> getActivesByEmployer_EmployerId(int employerId);
	
	@Query("From JobPosting where id=:jobPostingId")
	JobPosting getById(int jobPostingId);
	
	@Query("From JobPosting where status=true")
	List<JobPosting> getAllActives();
	
}
