package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

}

