package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.ResumeJobExperience;

public interface ResumeJobExperienceDao extends JpaRepository<ResumeJobExperience, Integer> {

}
