package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.WorkTypeService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.WorkTypeDao;
import project.hrms.entities.concretes.WorkType;

@Service
public class WorkTypeManager implements WorkTypeService{
 
	private WorkTypeDao workTypeDao;
	
	@Autowired
	public WorkTypeManager(WorkTypeDao workTypeDao) {
		super();
		this.workTypeDao = workTypeDao;
	}

	@Override
	public Result add(WorkType workType) {
		this.workTypeDao.save(workType);
		return new SuccessResult("Çalışma tipi eklendi.");
	}

	@Override
	public DataResult<List<WorkType>> getAll() {
		return new SuccessDataResult<List<WorkType>>(this.workTypeDao.findAll());

	}

}
