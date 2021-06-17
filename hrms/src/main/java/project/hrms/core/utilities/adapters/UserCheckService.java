package project.hrms.core.utilities.adapters;

import java.time.LocalDate;


public interface UserCheckService {
	
        boolean checkIfRealPerson(long nationalityId, String firstName, String lastName,LocalDate dateOfBirth);

}
