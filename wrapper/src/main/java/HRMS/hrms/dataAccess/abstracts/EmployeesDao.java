package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer>{

}
