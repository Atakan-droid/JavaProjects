package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.JobPosting;


public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

	 List<JobPosting> getByEmployer_EmployerId(int employerId);
}
