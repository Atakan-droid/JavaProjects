package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Candidates;



public interface CandidatesDao extends JpaRepository<Candidates, Integer> {

}

