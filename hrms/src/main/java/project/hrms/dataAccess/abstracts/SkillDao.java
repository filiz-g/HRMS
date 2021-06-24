package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill,Integer> {
	
	Skill getById(int id);
	
	List<Skill> findAllByCandidate_id(int id);


}
