package atakandroid.hrms.business.concretes;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.business.abstracts.ResumeService;
import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.ErrorDataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.core.utilities.results.SuccessDataResult;
import atakandroid.hrms.core.utilities.results.SuccessResult;
import atakandroid.hrms.dataAccess.abstracts.CandidatesDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeEducationDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeGraduateDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeImageDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeJobExperienceDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeLanguageDao;
import atakandroid.hrms.dataAccess.abstracts.ResumeTechnologyDao;
import atakandroid.hrms.entities.concretes.Candidate;
import atakandroid.hrms.entities.concretes.Graduate;
import atakandroid.hrms.entities.concretes.Resume;
import atakandroid.hrms.entities.concretes.ResumeEducation;
import atakandroid.hrms.entities.concretes.ResumeJobExperience;
import atakandroid.hrms.entities.dtos.ResumeDto;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	private ResumeTechnologyDao resumeTechnologyDao;
	private ResumeLanguageDao resumeLanguageDao;
	private ResumeEducationDao resumeEducationDao;
	private ResumeJobExperienceDao resumeJobExperienceDao;
	private ResumeImageDao resumeImageDao;
	private CandidatesDao candidateDao;
	private ResumeGraduateDao graduateDao;
	
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao,
			ResumeTechnologyDao resumeTechnologyDao, 
			ResumeLanguageDao resumeLanguageDao,
			ResumeEducationDao resumeEducationDao,
			ResumeJobExperienceDao resumeJobExperienceDao,
			ResumeImageDao resumeImageDao,
			CandidatesDao candidateDao,ResumeGraduateDao graduateDao) {
		super();
		this.resumeDao=resumeDao;
		this.resumeEducationDao=resumeEducationDao;
		this.resumeImageDao=resumeImageDao;
		this.resumeJobExperienceDao=resumeJobExperienceDao;
		this.resumeLanguageDao=resumeLanguageDao;
		this.resumeTechnologyDao=resumeTechnologyDao;
		this.candidateDao=candidateDao;
		this.graduateDao=graduateDao;
		
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
		return new SuccessResult("CV eklendi");
		
	}


	@Override
	public Result update(Resume resume) {
		 this.resumeDao.save(resume);
	        return new SuccessResult("Güncellendi");
	}

	
}
