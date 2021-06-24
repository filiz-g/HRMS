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

import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
@CrossOrigin
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
	
	
	
	@GetMapping("/getAllByEmployerId")
	public DataResult<List<JobAdvertisement>> getAllByEmployerId(@RequestParam int id){
		return this.jobAdvertisementService.getAllByEmployerId(id);
	}
	

	@PostMapping("/changeactivestatus")
	public Result changeIsActiveByEmployee(@RequestParam int id) {
		return this.jobAdvertisementService.changeIsActiveByEmployee(id);
	}

	@PostMapping("/changeopenstatus")
	public Result changeIsOpenByEmployer(@RequestParam int id) {
		return this.jobAdvertisementService.changeIsOpenByEmployer(id);
	}
	


	

}
