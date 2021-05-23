package atakandroid.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor
public class Candidates {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "identification_number")
	private String identification_number;
	@Column(name = "birth_date")
	private java.util.Date birth_date;
}
