package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobAdvertisementDao;
import project.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
    private JobAdvertisementDao jobAdvertisementDao;
    
    @Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
    
    private boolean CheckIfNullField(JobAdvertisement jobAdvertisement) {
		if (jobAdvertisement.getJobTitle() != null && jobAdvertisement.getDescription() != null && jobAdvertisement.getCity() != null && jobAdvertisement.getOpenPositionCount() != 0) {
			return true;
		}
		return false;
		
    }
    
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
 
		if(!CheckIfNullField(jobAdvertisement)){
			
			return new ErrorResult("Lütfen boş alanları kontrol ediniz");

		}
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı başarılı bir şekilde eklendi.");
	}
	
	
	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll());

	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı başarılı bir şekilde güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementDao.deleteById(id);
		return new SuccessResult("İş ilanı başarılı bir şekilde silindi.");
	
	}
		

	@Override
	public DataResult<List<JobAdvertisement>> getAllByEmployerId(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllByEmployerId(employerId),
				"İşveren id ile getirildi");
	}

	@Override
	public Result changeIsActiveByEmployee(int jobAdverttisementId) {
		JobAdvertisement jobAdvertisementIsActiveEmployee= this.jobAdvertisementDao.getById(jobAdverttisementId);
		jobAdvertisementIsActiveEmployee.setActive(!jobAdvertisementIsActiveEmployee.isActive());
		this.jobAdvertisementDao.save(jobAdvertisementIsActiveEmployee);
		return new SuccessResult("İş ilanının sistem çalışanı tarafından aktifliği değiştirildi.");
	}

	@Override
	public Result changeIsOpenByEmployer(int jobAdverttisementId) {
		JobAdvertisement jobAdvertToChangeIsOpen =this.jobAdvertisementDao.getById(jobAdverttisementId);
		jobAdvertToChangeIsOpen.setOpen(!jobAdvertToChangeIsOpen.isOpen());
		this.jobAdvertisementDao.save(jobAdvertToChangeIsOpen);
		return new SuccessResult("İş ilanı iş veren tarafından aktifleştirildi.");
	}


	
	

	
}