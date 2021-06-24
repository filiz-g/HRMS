package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
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

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı başarılı bir şekilde eklendi.");
	}

	@Override
	public DataResult<User> getByUserEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}
	
	
}



