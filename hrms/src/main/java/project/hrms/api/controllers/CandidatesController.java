package project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.CandidateService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.dtos.CvDto;
	
	@RestController
	@RequestMapping("/api/candidates")
	public class CandidatesController {
		
		private CandidateService candidateService;

		@Autowired
		public CandidatesController(CandidateService candidateService) {
			super();
			this.candidateService = candidateService;
		}
		
		@GetMapping("/getall")
		public DataResult<List<Candidate>> getAll(){
			return this.candidateService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Candidate candidate) {
			return this.candidateService.add(candidate);
			
		}
		
		@GetMapping("getCvById")
		public DataResult<CvDto> getCvById(@RequestParam int id){
			
			return this.candidateService.getCvById(id);
		}

}
