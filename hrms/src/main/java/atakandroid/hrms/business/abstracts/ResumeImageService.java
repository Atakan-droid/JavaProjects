package atakandroid.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.ResumeImage;

public interface ResumeImageService {

	Result add(ResumeImage resumeImage,MultipartFile file);
	Result update(ResumeImage resumeImage);
	Result delete(int id);
	
	DataResult<ResumeImage> getById(int id);
	DataResult<List<ResumeImage>> getAll();
	DataResult<List<ResumeImage>> getAllByResume_Id(int id);
}
