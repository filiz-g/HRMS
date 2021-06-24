package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.WorkHour;

public interface WorkHourDao extends JpaRepository<WorkHour,Integer> {
	
	WorkHour getById(int id);

	WorkHour findByWorkHour(String workHour);

}
