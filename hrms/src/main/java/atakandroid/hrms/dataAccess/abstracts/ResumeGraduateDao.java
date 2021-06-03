package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Graduate;

public interface ResumeGraduateDao extends JpaRepository<Graduate, Integer> {

}
