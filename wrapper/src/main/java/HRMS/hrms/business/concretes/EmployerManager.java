package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.EmployerService;
import HRMS.hrms.dataAccess.abstracts.EmployerDao;
import HRMS.hrms.entities.concretes.Employers;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employers> getAll() {
		
		return this.employerDao.findAll();
	}

}
