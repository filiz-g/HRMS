package project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;

@RestController
@CrossOrigin
@RequestMapping("api/jobexperiences")
public class JobExperiencesController {

	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobExperience jobExperience) {
		return this.jobExperienceService.update(jobExperience);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobExperience jobExperience) {
		
		return this.jobExperienceService.delete(jobExperience);
	}
	
	@GetMapping("/getbyid")
	public DataResult<JobExperience> getById(@RequestParam int id){
		return this.jobExperienceService.getById(id);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}

}
