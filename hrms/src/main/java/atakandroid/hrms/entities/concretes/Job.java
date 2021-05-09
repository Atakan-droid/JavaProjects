package atakandroid.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="job_titles")
public class Job {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "title")
	private String title;
}
