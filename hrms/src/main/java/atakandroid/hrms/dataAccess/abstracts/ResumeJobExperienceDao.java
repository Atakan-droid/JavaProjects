package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.ResumeJobExperience;

public interface ResumeJobExperienceDao extends JpaRepository<ResumeJobExperience, Integer> {

	
	ResumeJobExperience getById(int id);
	
	List<ResumeJobExperience> getByResume(int id);
}
