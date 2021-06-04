package atakandroid.hrms.business.concretes;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.business.abstracts.ResumeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeDao;
import atakandroid.hrms.entities.concretes.Resume;
import atakandroid.hrms.entities.dtos.ResumeAddDto;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao=resumeDao;
		
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(),"Tüm Öz Geçmişler Getirildi");
	}

	@Override
	public DataResult<Resume> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Resume>> getByCandidateId(int candidateId) {
		
		   var result = this.resumeDao.getByCandidate(candidateId);
	        return result.isEmpty()
	                ? new ErrorDataResult<>("Özgeçmiş Bulunamadı")
	                : new SuccessDataResult<>(result, "Bulundu");
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Öz geçmiş Eklendi");
	}

	@Override
	public Result addImage(MultipartFile multipartFile, int id) throws IOException {
	/*	  var resume = this.getById(id);
	        if (!resume.isSuccess()) return resume;

	        var imageAddResult = this.imageService.upload(multipartFile);
	        if (!imageAddResult.isSuccess()) return new ErrorResult("Resim eklenmedi");

	        var currentResume = resume.getData();
	        Map<String, String> newImageResult = (Map<String, String>) imageAddResult.getData();

	        currentResume.setImageUrl((newImageResult.get("url")));
	        var updateResume = this.update(currentResume);
	        if (!updateResume.isSuccess()) return new ErrorResult("Resim özgeçmişe eklenemedi");

	    */     return new SuccessResult("Resim Güncellendi");
	}

	@Override
	public Result update(Resume resume) {
		 this.resumeDao.save(resume);
	        return new SuccessResult("Güncellendi");
	}

	
}
