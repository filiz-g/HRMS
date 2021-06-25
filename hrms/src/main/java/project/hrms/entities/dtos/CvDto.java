package project.hrms.entities.dtos;

import java.util.List;

import project.hrms.entities.concretes.Candidate;
import project.hrms.entities.concretes.CoverLetter;
import project.hrms.entities.concretes.Image;
import project.hrms.entities.concretes.JobExperience;
import project.hrms.entities.concretes.Language;
import project.hrms.entities.concretes.Link;
import project.hrms.entities.concretes.School;
import project.hrms.entities.concretes.Skill;

public class CvDto {
	
    public Candidate candidate;
	
	public List<School> schools;
	
	public Image image;

	public List<Skill> skills;
	
	public List<Link> links;
	
	public List<Language> languages;
	
	public List<JobExperience> jobExperiences;
		
	public List<CoverLetter> coverLetters;
	
	

}
