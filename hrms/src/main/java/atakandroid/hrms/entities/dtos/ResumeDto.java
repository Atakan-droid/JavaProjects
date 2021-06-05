package atakandroid.hrms.entities.dtos;

import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

import atakandroid.hrms.entities.concretes.Candidate;
import atakandroid.hrms.entities.concretes.ResumeEducation;
import atakandroid.hrms.entities.concretes.ResumeImage;
import atakandroid.hrms.entities.concretes.ResumeJobExperience;
import atakandroid.hrms.entities.concretes.ResumeLanguage;
import atakandroid.hrms.entities.concretes.ResumeTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeDto {

	
	private int candidateId;
	private List<JobExperienceDto> jobExperienceDto;
	private List<ResumeLanguage> resumeLanguage;
	private List<EducationDto> educationDto;
	private List<ResumeTechnology> resumeTechnology;
	private String githubLink;
	private String linkedinLink;
	private String description;
}
