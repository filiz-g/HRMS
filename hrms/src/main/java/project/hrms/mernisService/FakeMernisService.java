package project.hrms.mernisService;

import java.time.LocalDate;

public class FakeMernisService {
	
	public boolean TCKimlikDogrula(long nationalityNumber,String firstName,String lastName,LocalDate dateOfBirth) {
		
		System.out.println(firstName+ " " +lastName + " adlı kişinin doğrulaması gerçekleştirildi ve onaylandı. ");
		return true;
	}

}
