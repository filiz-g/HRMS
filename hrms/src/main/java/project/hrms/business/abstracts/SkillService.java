package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Skill;

public interface SkillService {
	
	DataResult<List<Skill>> getAll();

	DataResult<List<Skill>> getAllByCandidateId(int id);

    Result add(Skill skill);
	
	Result update(Skill skill);
	
	Result delete(Skill skill);
}
