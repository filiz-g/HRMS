package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.hrms.business.abstracts.LinkService;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Link;

@RestController
@CrossOrigin
@RequestMapping("api/links")
public class LinksController {
	
	private LinkService linkService;

	@Autowired
	public LinksController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Link link) {
		return this.linkService.add(link);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Link link) {
		return this.linkService.update(link);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Link link) {
		return this.linkService.delete(link);
	}
	

}
