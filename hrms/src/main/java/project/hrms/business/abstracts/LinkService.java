package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Link;

public interface LinkService {
	
	DataResult<List<Link>> getAll();
  	
    DataResult<List<Link>> getAllByCandidateId(int id);
	
	Result add(Link link);
	
	Result update(Link link);
	
	Result delete(Link link);

}
