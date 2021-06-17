package project.hrms.business.concretes;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.CandidateService;
import project.hrms.core.utilities.adapters.UserCheckService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CandidateDao;
import project.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private UserCheckService userCheckService;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,UserCheckService userCheckService) {
		super();
		this.candidateDao = candidateDao;
		this.userCheckService=userCheckService;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Tüm iş arayanlar listelendi.");
	}

	@Override
	public Result add(Candidate candidate) {
		return new SuccessResult("İş arayan başarılı bir şekilde eklendi.");
	}

	@Override
	public DataResult<Candidate> getByNationalityId(String nationalityId) {
		return new SuccessDataResult<Candidate>(this.candidateDao.findByNationalityId(nationalityId));
    }
	

	@Override
	public DataResult<Candidate> getByEmail(String email) {
		
		return new SuccessDataResult<Candidate>(this.candidateDao.findByEmail(email));
	}

	
	
   private boolean checkIfRealPerson(Candidate candidate) {
	   
	   if(!this.userCheckService.checkIfRealPerson(Long.parseLong(candidate.getNationalityId()),candidate.getFirstName().toUpperCase(new Locale("tr")),
			   candidate.getLastName().toLowerCase(new Locale("tr")),candidate.getDateOfBirth())) {
		   
		   return false;
	   }
	   return true;
		
   }
			


}
	
	
