package HRMS.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.hrms.business.abstracts.JobTitlesService;
import HRMS.hrms.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobTitles/")
public class JobTitleController {
	
	private JobTitlesService jobTitlesService;
	
	@Autowired
	public JobTitleController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}
	@GetMapping("getall")
	public List<JobTitles> getAll(){
		return this.jobTitlesService.getAll();
		
	}
	

}
