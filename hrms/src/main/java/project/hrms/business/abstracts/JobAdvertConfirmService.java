package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertConfirm;

public interface JobAdvertConfirmService {
	
	Result add(JobAdvertConfirm jobAdvertConfirm);
	DataResult<List<JobAdvertConfirm>> getAll();

}
