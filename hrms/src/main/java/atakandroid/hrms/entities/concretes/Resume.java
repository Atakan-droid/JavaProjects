package atakandroid.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private int id;
	
	@JsonIgnore
	@ManyToOne(targetEntity = Candidate.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "candidate_id",referencedColumnName = "candidate_id",nullable = false)
	private Candidate candidate;
	
	@Column(name = "github_link")
	private String githubLink;
	
	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@Column(name = "description")
	private String description;
	
	
	@JsonIgnore
	@Column(name = "created_date")
	private LocalDate createdDate=LocalDate.now();
	
	@Column(name = "updated_date")
	private LocalDate updatedDate;
	
	@Column(name = "is_active")
	private boolean isActive=true;
	
	
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="resume_techs",joinColumns = {@JoinColumn(name="resume_id")} 
	,inverseJoinColumns = {@JoinColumn(name="technology_id")})
	private List<ResumeTechnology> technologies;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="resume_images",joinColumns = {@JoinColumn(name="resume_id")} 
	,inverseJoinColumns = {@JoinColumn(name="image_id")})
	private List<ResumeImage> photos;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="resume_languages",joinColumns = {@JoinColumn(name="resume_id")} 
	,inverseJoinColumns = {@JoinColumn(name="resume_language_id")})
	private List<ResumeLanguage> languages;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="resume_edus",joinColumns = {@JoinColumn(name="resume_id")} 
	,inverseJoinColumns = {@JoinColumn(name="resume_edu_id")})
	private List<ResumeEducation> educations;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="resume_job_experience",joinColumns = {@JoinColumn(name="resume_id")} 
	,inverseJoinColumns = {@JoinColumn(name="job_experience_id")})
	private List<ResumeJobExperience> jobExperiences;
}
