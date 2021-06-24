package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer> {
	
	Language getById(int id);

	List<Language> findAllByCandidate_id(int id);


}