package atakandroid.hrms.business.abstracts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import atakandroid.hrms.core.utilities.results.DataResult;
import atakandroid.hrms.core.utilities.results.Result;
import atakandroid.hrms.entities.concretes.Resume;
import atakandroid.hrms.entities.dtos.ResumeAddDto;

public interface ResumeService {

	DataResult<List<Resume>> getAll();

	DataResult<Resume> getById(int id);

	DataResult<List<Resume>> getByCandidateId(int candidateId);

	Result add(Resume resume);

	Result addImage(MultipartFile multipartFile, int id) throws IOException;

	Result update(Resume resume);
}
