package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.ResumeTechnologyService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeTechnologyDao;
import atakandroid.hrms.entities.concretes.ResumeTechnology;

@Service
public class ResumeTechnologyManager implements ResumeTechnologyService {

	private ResumeTechnologyDao resumeTechnologyDao;
	
	@Autowired
	public ResumeTechnologyManager(ResumeTechnologyDao resumeTechnologyDao) {
		super();
		this.resumeTechnologyDao = resumeTechnologyDao;
	}

	@Override
	public Result add(ResumeTechnology resumeTechnology) {
		this.resumeTechnologyDao.save(resumeTechnology);
		return new SuccessResult("Başarılı Ekleme");
	}

	@Override
	public Result update(ResumeTechnology resumeTechnology) {
		this.resumeTechnologyDao.save(resumeTechnology);
		return new SuccessResult("Başarılı Güncelleme");
	}

	@Override
	public Result delete(int id) {
		this.resumeTechnologyDao.deleteById(id);;
		return new SuccessResult("Başarılı Silme");
	}

	@Override
	public DataResult<ResumeTechnology> getById(int id) {
		
		return new SuccessDataResult<ResumeTechnology>(this.resumeTechnologyDao.getById(id),"Id ye göre getirildi");
	}

	@Override
	public DataResult<List<ResumeTechnology>> getAll() {
		return new SuccessDataResult<List<ResumeTechnology>>(this.resumeTechnologyDao.findAll(),"Tüm Teknolojiler Getirildi");
	}

	@Override
	public DataResult<List<ResumeTechnology>> getAllByResume_Id(int id) {
		return new SuccessDataResult<List<ResumeTechnology>>(this.resumeTechnologyDao.getByResume(id),"Cv ye göre getirildi");
	}

}
