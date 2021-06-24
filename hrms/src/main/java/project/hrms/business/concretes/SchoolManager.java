package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.SchoolService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.SchoolDao;
import project.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getAllByCandidateIdOrderByGraduationYear(int id) {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAllByCandidate_idOrderByGraduationYear(id));

	}

	@Override
	public DataResult<List<School>> getAllByCandidateId(int id) {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAllByCandidate_id(id));

	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul bilgisi eklendi.");
	}

	@Override
	public Result update(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul bilgisi güncellendi.");
	}

	@Override
	public Result delete(School school) {
		this.schoolDao.delete(school);
		return new SuccessResult("Okul bilgisi silindi.");
	}

}
