package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.dataAccess.abstracts.UserDao;
import project.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
	super();
	this.userDao=userDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {

		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi.");
	}

}
