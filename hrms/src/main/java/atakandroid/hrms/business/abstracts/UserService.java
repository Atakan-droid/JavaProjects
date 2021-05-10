package atakandroid.hrms.business.abstracts;

import java.util.List;

import atakandroid.hrms.entities.concretes.User;

public interface UserService {

	List<User> getAll();
}
