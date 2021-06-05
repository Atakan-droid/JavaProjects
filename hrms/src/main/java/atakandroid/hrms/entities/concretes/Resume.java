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
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name = "github_link")
	private String githubLink;
	
	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@Column(name = "description")
	private String description;
	
	
	@JsonIgnore
	@Column(name = "created_date",nullable = true)
	private LocalDate createdDate=LocalDate.now();
	
	@JsonIgnore
	@Column(name = "updated_date",nullable=true)
	private LocalDate updatedDate;
	
	@Column(name = "is_active")
	private boolean isActive=true;
	
	
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "resume")
	private List<ResumeTechnology> technologies;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy ="resume" )
	private List<ResumeLanguage> languages;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "resume")
	private List<ResumeEducation> educations;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "resume")
	private List<ResumeJobExperience> jobExperiences;
	
	
}
