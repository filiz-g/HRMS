package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	
	DataResult<List<JobExperience>> getAllByCandidateId(int id);
	
	DataResult<List<JobExperience>> getAll();
	
	DataResult<JobExperience> getById(int id);
	
	Result add(JobExperience jobExperience);
	
	Result update(JobExperience jobExperience);
	
	Result delete(JobExperience jobExperience);

}
