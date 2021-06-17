package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobAdvertConfirmService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobAdvertConfirmDao;
import project.hrms.entities.concretes.JobAdvertConfirm;

@Service
public class JobAdvertConfirmManager implements JobAdvertConfirmService {

	private JobAdvertConfirmDao jobAdvertConfirmDao;
	
	@Autowired
	public JobAdvertConfirmManager(JobAdvertConfirmDao jobAdvertConfirmDao) {
		super();
		this.jobAdvertConfirmDao = jobAdvertConfirmDao;
	}

	@Override
	public Result add(JobAdvertConfirm jobAdvertConfirm) {
		this.jobAdvertConfirmDao.save(jobAdvertConfirm);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<JobAdvertConfirm>> getAll() {
	
		return new SuccessDataResult<List<JobAdvertConfirm>>(this.jobAdvertConfirmDao.findAll());

	}

}

