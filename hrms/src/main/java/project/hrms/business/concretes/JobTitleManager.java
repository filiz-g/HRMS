package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobTitleService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobTitleDao;
import project.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
    
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"Tüm iş pozisyonları listelendi.");
				
	}


	@Override
	public Result add(JobTitle jobTitle) {
		if(getByJobTitle(jobTitle.getJobTitle()).getData() != null){
			return new ErrorResult( "İş pozisyonu zaten mevcut.");
		}
		this.jobTitleDao.save(jobTitle);
	    return new SuccessResult("İş Pozisyonu başarılı bir şekilde eklendi.");
	}

	@Override
	public DataResult<JobTitle> getByJobTitle(String title) {
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.findByJobTitle(title));

	}
}
