package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience,Integer> {
	
	JobExperience getById(int id);
	
	
	List<JobExperience> findAllByCandidate_id(int id);
	
	
} 
