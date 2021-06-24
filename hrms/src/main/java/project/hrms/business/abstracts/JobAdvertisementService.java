package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	Result delete(int id);
	DataResult<JobAdvertisement> getById(int id);
	DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllByEmployerId(int employerId);
	Result changeIsActiveByEmployee(int jobAdverttisementId);	
	Result changeIsOpenByEmployer(int jobAdverttisementId);	
	

	
}
