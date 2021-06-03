package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.ResumeTechnology;

public interface ResumeTechnologyDao extends JpaRepository<ResumeTechnology, Integer>  {

}
