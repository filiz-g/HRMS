package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.hrms.entities.concretes.JobAdvertConfirm;


public interface JobAdvertConfirmDao extends JpaRepository<JobAdvertConfirm,Integer>{

}
