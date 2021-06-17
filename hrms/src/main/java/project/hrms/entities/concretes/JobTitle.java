package project.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_titles")
public class JobTitle {
	

		    @Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    @Column(name="id")
	        private int id;

		    @Column(name="title")
	        private String jobTitle;

		    @Column(name="created_date")
	        private LocalDate createdDate;
	     
		    @Column(name="is_active")
	        private boolean isActive;
		 
	    public JobTitle() {};

		public JobTitle(int id, String jobTitle, LocalDate createdDate, boolean isActive) {
			super();
			this.id = id;
			this.jobTitle = jobTitle;
			this.createdDate = createdDate;
			this.isActive = isActive;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getJobTitle() {
			return jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public LocalDate getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDate createdDate) {
			this.createdDate = createdDate;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		
}

