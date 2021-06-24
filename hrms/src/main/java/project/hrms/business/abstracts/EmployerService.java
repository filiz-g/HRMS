package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();

}
