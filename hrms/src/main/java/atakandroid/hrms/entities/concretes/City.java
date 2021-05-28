package atakandroid.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cities")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_postings"})
public class City {

	@Id
	@Column(name = "cityid")
	private int cityid;
	@Column(name = "cityname")
	private String cityName;
	@Column(name = "plateno")
	private String plateNo;
	@Column(name = "phonecode")
	private String phoneCode;
	
	@OneToMany(mappedBy = "city")
	private List<JobPosting> job_postings;
}
