package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Employers;

public interface EmployerDao extends JpaRepository<Employers, Integer>{

}
