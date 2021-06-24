package project.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.CandidateService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CandidateDao;
import project.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("İş arayan başarılı bir şekilde eklendi.");
	}

	@Override
	public Result update(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("İş arayan başarılı bir şekilde güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.candidateDao.deleteById(id);
		return new SuccessResult("İş arayan başarılı bir şekilde silindi.");
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),
				"Tüm iş arayanlar listelendi.");
				
	}
	
	@Override
	public DataResult<Candidate> getById(int id) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));

	}

	@Override
	public DataResult<Candidate> getByCandidateNationalityId(String nationalityId) {
		return new SuccessDataResult<Candidate>(this.candidateDao.findByNationalityId(nationalityId));
	}

	

	

     

}
	
	
