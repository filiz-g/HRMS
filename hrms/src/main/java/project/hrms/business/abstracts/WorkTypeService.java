package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.WorkType;

public interface WorkTypeService {

    Result add(WorkType workType);
	
	DataResult<List<WorkType>> getAll();
}
