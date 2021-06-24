package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobExperienceDao;
import project.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{
	
	private JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}


	@Override
	public DataResult<List<JobExperience>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAllByCandidate_id(id));

	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll());

	}

	@Override
	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>
		(this.jobExperienceDao.findById(id).orElseGet(null));


	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("İş tecrübesi eklendi.");
	}

	@Override
	public Result update(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("İş tecrübesi güncellendi.");
	}

	@Override
	public Result delete(JobExperience jobExperinence) {
		this.jobExperienceDao.delete(jobExperinence);
		return new SuccessResult("İş tecrübesi silindi.");
	}




}
