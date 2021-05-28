package atakandroid.hrms.mernisValidation;

import org.springframework.stereotype.Service;

import atakandroid.hrms.core.services.MernisCheckService;
import atakandroid.hrms.entities.concretes.Candidate;
@Service
public class MernisService implements MernisCheckService<Candidate> {

	@Override
	public boolean isMernis(Candidate candidate) {
		return candidate.getIdentification_number().length()==11;
	}

}
