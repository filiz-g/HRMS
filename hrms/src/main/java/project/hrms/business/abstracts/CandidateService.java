package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.dtos.CvDto;

public interface CandidateService {
	
	Result add(Candidate candidate);
	Result update(Candidate candidate);
	Result delete(int id);
	DataResult<List<Candidate>> getAll();
	DataResult<Candidate> getById(int id);	
	DataResult<Candidate> getByCandidateNationalityId(String nationalityId);
	DataResult<CvDto> getCvById(int id);


	

}
