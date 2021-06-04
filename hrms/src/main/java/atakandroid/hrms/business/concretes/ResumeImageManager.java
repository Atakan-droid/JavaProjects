package atakandroid.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

import atakandroid.hrms.business.abstracts.ResumeImageService;
import atakandroid.hrms.core.services.adapters.cloudinaryAdapter.CloudinaryService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.ResumeImageDao;
import atakandroid.hrms.entities.concretes.ResumeImage;

@Service
public class ResumeImageManager implements ResumeImageService {

	private ResumeImageDao resumeImageDao;
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public ResumeImageManager(ResumeImageDao resumeImageDao, CloudinaryService cloudinaryService) {
		this.resumeImageDao = resumeImageDao;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public Result add(ResumeImage resumeImage, MultipartFile file) {
		Map<String,String> image = this.cloudinaryService.uploadImage(file).getData();
		resumeImage.setImageUrl(image.get("url"));
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("Ekleme başarılı");
	}

	@Override
	public Result update(ResumeImage resumeImage) {
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("Güncelleme Başarılı");
	}

	@Override
	public Result delete(int id) {
		this.resumeImageDao.deleteById(id);
		return new SuccessResult("Başarıyla Silindi");
	}

	@Override
	public DataResult<ResumeImage> getById(int id) {
		
		return new SuccessDataResult<ResumeImage>(this.resumeImageDao.getById(id),"Başarıyla Getirildi");
	}

	@Override
	public DataResult<List<ResumeImage>> getAll() {
	
		return new SuccessDataResult<List<ResumeImage>>(this.resumeImageDao.findAll(),"Tüm Resimler Getirildi");
	}

	@Override
	public DataResult<List<ResumeImage>> getAllByResume_Id(int id) {
		
		return new SuccessDataResult<List<ResumeImage>>(this.resumeImageDao.getByResume(id),"CV ye göre getirildi");
	}

	
}
