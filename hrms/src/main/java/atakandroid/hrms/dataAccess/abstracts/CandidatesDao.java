package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Candidate;



public interface CandidatesDao extends JpaRepository<Candidate, Integer> {

}

