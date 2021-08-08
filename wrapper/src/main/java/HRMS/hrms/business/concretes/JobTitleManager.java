package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.JobTitlesService;
import HRMS.hrms.dataAccess.abstracts.JobTitlesDao;
import HRMS.hrms.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitlesService {
	
	private JobTitlesDao jobTitlesDao;
	
	@Autowired
	public JobTitleManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}

	@Override
	public List<JobTitles> getAll() {
		
		return this.jobTitlesDao.findAll();
	}

}
