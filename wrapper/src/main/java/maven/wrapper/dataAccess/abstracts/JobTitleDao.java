package maven.wrapper.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import maven.wrapper.entities.concretes.JobTitle;

public interface JobTitleDao  extends JpaRepository<JobTitle,Integer>{

}
