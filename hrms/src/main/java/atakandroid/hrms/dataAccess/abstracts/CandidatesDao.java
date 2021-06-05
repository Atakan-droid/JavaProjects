package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Candidate;



public interface CandidatesDao extends JpaRepository<Candidate, Integer> {

	@Query("From Candidate where candidate_id=:candidateId")
	Candidate getById(int candidateId);
	
}

