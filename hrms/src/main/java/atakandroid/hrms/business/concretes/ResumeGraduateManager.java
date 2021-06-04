package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.ResumeGraduateService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeGraduateDao;
import atakandroid.hrms.entities.concretes.Graduate;

@Service
public class ResumeGraduateManager implements ResumeGraduateService {

	private ResumeGraduateDao resumeGraduateDao;
	@Autowired
	public ResumeGraduateManager(ResumeGraduateDao resumeGraduateDao) {
		this.resumeGraduateDao=resumeGraduateDao;
	}
	@Override
	public DataResult<List<Graduate>> getAll() {
		
		return new SuccessDataResult<List<Graduate>>(this.resumeGraduateDao.findAll(),"Tüm Mezuniyet Türleri Getirildi");
	}

	@Override
	public Result add(Graduate graduate) {

		this.resumeGraduateDao.save(graduate);
		return new SuccessResult("Mezuniyet Türü Eklendi");
	}
	@Override
	public Result update(Graduate graduate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Graduate> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<Graduate>> getAllByResume_Id(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
