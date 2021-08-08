package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates,Integer>{

}
