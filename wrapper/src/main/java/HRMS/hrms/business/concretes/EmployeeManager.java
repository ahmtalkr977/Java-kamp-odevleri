package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.EmployeeService;
import HRMS.hrms.dataAccess.abstracts.EmployeesDao;
import HRMS.hrms.entities.concretes.Employees;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeesDao employeesDao;
	
	@Autowired
	public EmployeeManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public List<Employees> getAll() {
		
		return this.employeesDao.findAll();
	}

}
