package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.entities.concretes.Employees;

public interface EmployeeService {
	List<Employees> getAll();

}
