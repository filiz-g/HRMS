package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {

	Image findByCandidate_id(int id);
	
	Image findById(int id);

}
