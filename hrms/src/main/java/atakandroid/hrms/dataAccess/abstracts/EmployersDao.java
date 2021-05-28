package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.Employer;

public interface EmployersDao extends JpaRepository<Employer, Integer> {

}

