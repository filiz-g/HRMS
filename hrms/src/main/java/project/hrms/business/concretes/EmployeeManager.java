package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.EmployeeService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.dataAccess.abstracts.EmployeeDao;
import project.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Tüm sistem çalışanı listelendi.") ;
	}
	}


