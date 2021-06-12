package project.hrms.core.utilities.adapters;



import org.springframework.stereotype.Service;

import project.hrms.mernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(String nationalityId, String firstName, String lastName, int birthOfYear) {
        
		FakeMernisService client= new FakeMernisService();
		
		boolean result = client.TCKimlikDogrula(nationalityId, firstName, lastName, birthOfYear);
		

		return result;
	}

	

	
}
