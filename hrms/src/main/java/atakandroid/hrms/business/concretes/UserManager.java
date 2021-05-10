package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.UserService;
import atakandroid.hrms.dataAccess.abstracts.UserDao;
import atakandroid.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	@Autowired
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
		
	}
	
@Override
public List<User> getAll() {
	
	return this.userDao.findAll() ;
}
}
