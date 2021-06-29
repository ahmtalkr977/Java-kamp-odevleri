package maven.wrapper.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maven.wrapper.business.abstracts.JobTitleService;
import maven.wrapper.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobtitles")
public class JobTitleControllers {
	
	private JobTitleService jobTitleService;
	public JobTitleControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	@GetMapping("/getall")
	
	public List<JobTitle> getAll(){ 
		return jobTitleService.getAll();
	}

}
