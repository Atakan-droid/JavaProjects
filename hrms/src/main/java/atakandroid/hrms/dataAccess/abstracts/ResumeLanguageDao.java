package atakandroid.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.ResumeLanguage;

public interface ResumeLanguageDao extends JpaRepository<ResumeLanguage, Integer>  {


	ResumeLanguage getById(int id);
	
	List<ResumeLanguage> getAllByResume(int id);
	
	
}
