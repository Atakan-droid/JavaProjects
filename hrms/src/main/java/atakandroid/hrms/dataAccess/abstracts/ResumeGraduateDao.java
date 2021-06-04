package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Graduate;


public interface ResumeGraduateDao extends JpaRepository<Graduate, Integer> {

	Graduate getById(int id);
	
	
	
}
