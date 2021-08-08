package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.UserService;
import HRMS.hrms.dataAccess.abstracts.UserDao;
import HRMS.hrms.entities.abstracts.User;


@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User>getall() {
		
		return this.userDao.findAll();
	}

}
