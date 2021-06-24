package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{

	
	JobAdvertisement findById(int id);

	List<JobAdvertisement> getAllByEmployerId(int id);
	
	List<JobAdvertisement> getByEmployer_CompanyName(String companyName);

	



	

	
}