package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	DataResult<JobAdvertisement> getById(int id);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllOpenJobAdvertisementList();
    DataResult<List<JobAdvertisement>> findAllByOrderByPublishedAtDesc();
    DataResult<List<JobAdvertisement>> getAllOpenJobAdvertisementByEmployer(int id);


	
}
