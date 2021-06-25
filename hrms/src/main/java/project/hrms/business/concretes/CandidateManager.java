package project.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.CandidateService;
import project.hrms.business.abstracts.CoverLetterService;
import project.hrms.business.abstracts.ImageService;
import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.business.abstracts.LanguageService;
import project.hrms.business.abstracts.LinkService;
import project.hrms.business.abstracts.SchoolService;
import project.hrms.business.abstracts.SkillService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CandidateDao;
import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.dtos.CvDto;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private SchoolService schoolService;
	private ImageService imageService;
	private JobExperienceService jobExperienceService;
	private LanguageService languageService;
	private LinkService linkService;
	private SkillService skillService;
	private CoverLetterService coverLetterService;
	
    @Autowired
	public CandidateManager(CandidateDao candidateDao, SchoolService schoolService, ImageService imageService,
			JobExperienceService jobExperienceService, LanguageService languageService, LinkService linkService,
			SkillService skillService, CoverLetterService coverLetterService) {
		super();
		this.candidateDao = candidateDao;
		this.schoolService = schoolService;
		this.imageService = imageService;
		this.jobExperienceService = jobExperienceService;
		this.languageService = languageService;
		this.linkService = linkService;
		this.skillService = skillService;
		this.coverLetterService = coverLetterService;
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

	@Override
	public DataResult<CvDto> getCvById(int id) {
		
		CvDto cvDto=new CvDto();
		
		cvDto.jobExperiences =this.jobExperienceService.getAllByCandidateId(id).getData();
		cvDto.schools = this.schoolService.getAllByCandidateId(id).getData();
		cvDto.languages =this.languageService.getAllByCandidateId(id).getData();
		cvDto.links =this.linkService.getAllByCandidateId(id).getData();
		cvDto.skills =this.skillService.getAllByCandidateId(id).getData();
		cvDto.image =this.imageService.getByCandidateId(id).getData();
		cvDto.coverLetters = this.coverLetterService.getAllByCandidateId(id).getData();
		return new SuccessDataResult<CvDto>(cvDto);

		
	}

	

	

    
}
	
	
