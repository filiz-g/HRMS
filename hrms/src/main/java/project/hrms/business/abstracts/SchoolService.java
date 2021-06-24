package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.School;

public interface SchoolService {
	
	DataResult<List<School>> getAllByCandidateIdOrderByGraduationYear(int id);

	DataResult<List<School>> getAllByCandidateId(int id);
	
	Result add(School school);
	
	Result update(School school);
	
	Result delete(School school);

}
