package atakandroid.hrms.mernisValidation;

import org.springframework.stereotype.Service;

import atakandroid.hrms.core.services.MernisCheckService;
import atakandroid.hrms.entities.concretes.Candidates;
@Service
public class MernisService implements MernisCheckService<Candidates> {

	@Override
	public boolean isMernis(Candidates candidate) {
		return candidate.getIdentification_number().length()==11;
	}

}
