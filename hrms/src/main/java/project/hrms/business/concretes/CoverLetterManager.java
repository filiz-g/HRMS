package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.CoverLetterService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CoverLetterDao;
import project.hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{

	private CoverLetterDao coverLetterDao;
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAllByCandidateId(int id) {
	
		return new SuccessDataResult<List<CoverLetter>>
		(this.coverLetterDao.findAllByCandidate_id(id));

	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Ön yazı eklendi.");
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Ön yazı güncellendi.");
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.coverLetterDao.delete(coverLetter);
        return new SuccessResult("Ön yazı silindi.");
	}

	@Override
	public DataResult<CoverLetter> getById(int id) {

		return new SuccessDataResult<CoverLetter>
		(this.coverLetterDao.getById(id));

		
	}


	

}
