package atakandroid.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import atakandroid.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>  {

}
