package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.WorkHourService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.WorkHourDao;
import project.hrms.entities.concretes.WorkHour;

@Service
public class WorkHourManager implements WorkHourService {

	private WorkHourDao workHourDao;
	
	@Autowired
	public WorkHourManager(WorkHourDao workHourDao) {
		super();
		this.workHourDao = workHourDao;
	}

	@Override
	public Result add(WorkHour workHour) {
		this.workHourDao.save(workHour);
		return new SuccessResult("Çalışma zamanı eklendi.");
	}
	

	@Override
	public DataResult<List<WorkHour>> getAll() {
		return new SuccessDataResult<List<WorkHour>>
		(this.workHourDao.findAll());

	}

}
