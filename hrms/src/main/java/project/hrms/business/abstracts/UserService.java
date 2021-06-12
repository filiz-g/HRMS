package project.hrms.business.abstracts;

import java.util.List;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
}
