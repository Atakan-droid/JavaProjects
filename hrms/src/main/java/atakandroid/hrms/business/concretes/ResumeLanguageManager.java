package atakandroid.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atakandroid.hrms.business.abstracts.ResumeLanguageService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeLanguageDao;
import atakandroid.hrms.entities.concretes.ResumeLanguage;

@Service
public class ResumeLanguageManager implements ResumeLanguageService {

	private ResumeLanguageDao resumeLanguagedao;
	
	@Autowired
	public ResumeLanguageManager(ResumeLanguageDao resumeLanguagedao) {
		super();
		this.resumeLanguagedao = resumeLanguagedao;
	}

	@Override
	public Result add(ResumeLanguage resumeLanguage) {
		this.resumeLanguagedao.save(resumeLanguage);
		return new SuccessResult("Başarılıyla Eklendi");
	}

	@Override
	public Result update(ResumeLanguage resumeLanguage) {
		this.resumeLanguagedao.save(resumeLanguage);
		return new SuccessResult("Başarılı Güncelleme");
	}

	@Override
	public Result delete(int id) {
		this.resumeLanguagedao.deleteById(id);
		return new SuccessResult("Başarılı Silme");
	}

	@Override
	public DataResult<ResumeLanguage> getById(int id) {
		return new SuccessDataResult<ResumeLanguage>(this.resumeLanguagedao.getById(id),"Id ye göre getirildi");
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAll() {
		return new SuccessDataResult<List<ResumeLanguage>>(this.resumeLanguagedao.findAll(),"Tüm Diller getiirildi");
	}

	@Override
	public DataResult<List<ResumeLanguage>> getAllByResume_Id(int id) {
		return new SuccessDataResult<List<ResumeLanguage>>(this.resumeLanguagedao.getAllByResume(id),"Cv ye göre getirildi");
	}

}
