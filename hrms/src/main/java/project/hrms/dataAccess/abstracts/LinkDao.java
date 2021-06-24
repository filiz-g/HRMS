package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link,Integer> {
	
	Link getById(int id);
	
	List<Link> findAllByCandidate_id(int id);


}
