package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer> {

}
