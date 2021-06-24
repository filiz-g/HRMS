package project.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School,Integer> {

    List<School> findAllByCandidate_idOrderByGraduationYear(int id);
	
	List<School> findAllByCandidate_id(int id);
}
