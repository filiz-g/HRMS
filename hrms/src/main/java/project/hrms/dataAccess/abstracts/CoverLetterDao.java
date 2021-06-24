package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter,Integer> {
    
	List<CoverLetter> findAllByCandidate_id(int id);
	
    CoverLetter findById(int id);
}


