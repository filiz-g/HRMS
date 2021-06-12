package project.hrms.mernisService;

public class FakeMernisService {
	
	public boolean TCKimlikDogrula(String nationalityNumber,String firstName,String lastName,int birthofYear) {
		
		System.out.println(firstName+ " " +lastName + " adlı kişinin doğrulaması gerçekleştirildi ve onaylandı. ");
		return true;
	}

}
