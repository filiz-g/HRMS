package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Language;

public interface LanguageService {

    Result add(Language language);
	
	Result update(Language language);
	
	Result delete(Language language);
	
	DataResult<List<Language>>  getAll();

    DataResult<List<Language>> getAllByCandidateId(int candidateId);
	
	
}

