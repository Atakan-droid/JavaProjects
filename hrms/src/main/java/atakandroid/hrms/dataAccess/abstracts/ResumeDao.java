package atakandroid.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

	 List<Resume> getByCandidate(int candidateId);
}
