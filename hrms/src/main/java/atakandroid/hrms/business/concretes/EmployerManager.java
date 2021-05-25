package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.EmployerService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.EmployersDao;
import atakandroid.hrms.entities.concretes.Employers;

@Service
public class EmployerManager implements EmployerService {

	@Autowired
	private EmployersDao employerdao;

	public EmployerManager(EmployersDao employerdao) {
		this.employerdao = employerdao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {

		return new SuccessDataResult<List<Employers>>(this.employerdao.findAll(), "İş verenler getirildi");
	}

	@Override
	public Result add(Employers employer) {

		this.employerdao.save(employer);
		return new SuccessResult("İş veren kullanıcı sisteme eklendi");

	}
}
