package atakandroid.hrms.api.controlles;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.business.abstracts.ResumeImageService;
import atakandroid.hrms.business.abstracts.ResumeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Resume;
import atakandroid.hrms.entities.concretes.ResumeImage;

@RestController
@RequestMapping("/api/cvImage")
public class ResumeImagesController {
	
	private ResumeImageService resumeImageService;
	private ResumeService resumeService;
	
	@Autowired
	public ResumeImagesController(ResumeImageService resumeImageService, ResumeService resumeService) {
		this.resumeImageService = resumeImageService;
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ResumeImage>> getAll(){
		return this.resumeImageService.getAll();
	}
	
	@GetMapping("/getByResume_id")
	public DataResult<List<ResumeImage>> getByCandidate_id(@RequestParam int id){
		return this.resumeImageService.getAllByResume_Id(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestParam int id, @RequestParam MultipartFile filePath) throws IOException {
		Resume resume = this.resumeService.getById(id).getData();
		if(resume==null) {
			return new ErrorResult("Böyle bi Cv yok");
		}
		ResumeImage resumeImage = new ResumeImage();
		resumeImage.setResume(resume);		
		return this.resumeImageService.add(resumeImage, filePath);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ResumeImage resumeImage) {
		return this.resumeImageService.update(resumeImage);
	}
	
	@PostMapping("/delete")
	public Result update(@RequestParam int id) {
		return this.resumeImageService.delete(id);
	}

}
