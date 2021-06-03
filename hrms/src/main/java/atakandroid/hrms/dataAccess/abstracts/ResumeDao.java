package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

}
