package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.WorkHour;

public interface WorkHourService {
	
    Result add(WorkHour workHour);
	
	DataResult<List<WorkHour>> getAll();
}

