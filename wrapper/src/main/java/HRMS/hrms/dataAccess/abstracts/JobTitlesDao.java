package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao  extends JpaRepository<JobTitles, Integer>{

}
