package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.SystemEmployeeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.SystemEmployeeDao;
import atakandroid.hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {

	SystemEmployeeDao systemEmployeeDao;
	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao=systemEmployeeDao;
	}

	@Override
	public DataResult<List<SystemEmployee>> getAll() {
		
		return new SuccessDataResult<List<SystemEmployee>>(this.systemEmployeeDao.findAll(),"Tüm Personel Getirildi");
	}

	@Override
	public Result add(SystemEmployee systemEmployee) {
		
		this.systemEmployeeDao.save(systemEmployee);
		return new SuccessResult("Başarılı Çalışan Ekleme");
	}

}
