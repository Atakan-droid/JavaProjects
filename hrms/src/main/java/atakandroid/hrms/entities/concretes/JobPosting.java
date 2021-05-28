package atakandroid.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="job_postings")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_postings"})
public class JobPosting {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "posting_id")
	private int id;
	@Column(name = "salary")
	private String salary;
	@Column(name = "open_position")
	private String openPosition;
	@Column(name = "release_date")
	private Date releaseDate;
	@Column(name = "deadline")
	private Date deadline;
	@Column(name = "entry")
	private String entry;
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
}
