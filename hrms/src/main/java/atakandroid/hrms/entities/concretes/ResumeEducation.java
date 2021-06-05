package atakandroid.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resume_edus")
public class ResumeEducation {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonIgnore
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	@Column(name = "school_name")
	@NotBlank(message="Boş Geçilemez")
	private String schoolName;
	
	@ManyToOne(targetEntity = Graduate.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "graduate_id",referencedColumnName = "id",nullable = false)
	private Graduate graduate;
	
	@Column(name = "started_date")
	@NotBlank(message = "Boş Bırakılamaz")
	private LocalDate startedDate;
	
	@Column(name = "ended_date")
	private String endedDate() {
		if(endedDate() == null) return "Devam Ediyor";
		return endedDate().toString();
	}
	
	
	
}
