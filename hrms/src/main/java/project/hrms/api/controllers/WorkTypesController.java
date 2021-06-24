package project.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.WorkTypeService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.entities.concretes.WorkType;

@RestController
@CrossOrigin
@RequestMapping("/api/worktypes")
public class WorkTypesController {
	
	private WorkTypeService workTypeService;

	@Autowired
	public WorkTypesController(WorkTypeService workTypeService) {
		super();
		this.workTypeService = workTypeService;
	}

	@PostMapping("add")
	public ResponseEntity<?> add(@Valid @RequestBody WorkType workType){
		return ResponseEntity.ok(this.workTypeService.add(workType));
	}
	
	@GetMapping("getall")
	public DataResult<List<WorkType>> getAll(){
		return this.workTypeService.getAll();
	}

}
