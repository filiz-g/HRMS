package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.WorkType;

public interface WorkTypeDao extends JpaRepository<WorkType,Integer>{
	
	WorkType getById(int id);

	WorkType findByWorkType(String workType);


}
