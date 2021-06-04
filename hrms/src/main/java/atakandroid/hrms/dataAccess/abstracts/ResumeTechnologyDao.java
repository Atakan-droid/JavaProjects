package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.ResumeTechnology;

public interface ResumeTechnologyDao extends JpaRepository<ResumeTechnology, Integer>  {

	ResumeTechnology getById(int id);
	
	List<ResumeTechnology> getByResume(int id);
}
