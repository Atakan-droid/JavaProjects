package atakandroid.hrms.entities.dtos;

import java.time.LocalDate;
import java.util.List;

import atakandroid.hrms.entities.concretes.ResumeEducation;
import atakandroid.hrms.entities.concretes.ResumeJobExperience;
import atakandroid.hrms.entities.concretes.ResumeLanguage;
import atakandroid.hrms.entities.concretes.ResumeTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationDto {

	private int graduateId;
	private String schoolName;
	private LocalDate startedDate;
	private String endedDate="Devam Ediyor";
}
