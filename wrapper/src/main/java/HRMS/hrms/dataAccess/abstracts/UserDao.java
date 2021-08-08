package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
