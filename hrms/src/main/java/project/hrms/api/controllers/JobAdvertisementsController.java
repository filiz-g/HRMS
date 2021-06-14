package project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {
	
	@Autowired
	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getAllOpenJobAdvertisementList")
	public DataResult<List<JobAdvertisement>> getAllOpenJobAdvertisementList(){
		return this.jobAdvertisementService.getAllOpenJobAdvertisementList();	}

	
	
	@GetMapping("/findAllByOrderByPublishedAtDesc")
    public DataResult<List<JobAdvertisement>> findAllByOrderByPublishedAtDesc(){
		return this.jobAdvertisementService.findAllByOrderByPublishedAtDesc();
	}
    
	@GetMapping("/getAllOpenJobAdvertisementByEmployer")
    public DataResult<List<JobAdvertisement>> getAllOpenJobAdvertisementByEmployer(int id){
		return this.jobAdvertisementService.getAllOpenJobAdvertisementByEmployer(id);
	}

	

}
