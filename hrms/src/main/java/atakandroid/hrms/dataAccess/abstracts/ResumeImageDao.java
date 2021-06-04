package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.ResumeImage;

public interface ResumeImageDao extends JpaRepository<ResumeImage, Integer> {

	ResumeImage getById(int id);
	
	List<ResumeImage> getByResume(int id);
}
