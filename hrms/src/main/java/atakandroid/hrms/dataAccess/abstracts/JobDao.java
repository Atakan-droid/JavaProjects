package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.JobPosition;

public interface JobDao extends JpaRepository<JobPosition, Integer> {

}
