package atakandroid.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class candidateDto {

	private String firstName;
	private String lastName;
	private String identificationNumber;
	private Date birthDate;
	private String password;
	private String password_re;
	
}
