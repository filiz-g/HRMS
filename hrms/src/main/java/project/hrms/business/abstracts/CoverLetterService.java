package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {

    DataResult<List<CoverLetter>> getAllByCandidateId(int id);
    
	DataResult<CoverLetter> getById(int id);	
	
	Result add(CoverLetter coverLetter);
	
	Result update(CoverLetter coverLetter);
	
	Result delete(CoverLetter coverLetter);
}
