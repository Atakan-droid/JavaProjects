package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.UserService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.UserDao;
import atakandroid.hrms.entities.concretes.Job;
import atakandroid.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	@Autowired
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
		
	}
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>( this.userDao.findAll(),"Kullanıcılar Getirildi");
	}
	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		 return new SuccessResult("Kullanıcı kaydedildi");
	}
	

}
