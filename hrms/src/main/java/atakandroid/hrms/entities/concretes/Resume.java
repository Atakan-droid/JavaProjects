package atakandroid.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resumes")
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int İd;
	
	@ManyToOne(targetEntity = Candidate.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "candidate_id",referencedColumnName = "candidate_id",nullable = false)
	private Candidate candidate;
	
	@Column(name = "github_link")
	private String githubLink;
	
	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@Column(name = "description")
	private String description;
	
	
	@Column(name = "created_date")
	private LocalDate createdDate=LocalDate.now();
	
	@Column(name = "updated_date")
	private LocalDate updatedDate;
	
	@Column(name = "is_active")
	private boolean isActive=true;
	
	@Column(name = "photo")
	private String photo;
	
	@OneToMany(mappedBy = "resume")
	private List<ResumeTechnology> technologies;
	
	@OneToMany(mappedBy = "resume")
	private List<ResumeLanguage> languages;
	
	@OneToMany(mappedBy = "resume")
	private List<ResumeEducation> educations;
	
	@OneToMany(mappedBy = "resume")
	private List<ResumeJobExperience> jobExperiences;
}
