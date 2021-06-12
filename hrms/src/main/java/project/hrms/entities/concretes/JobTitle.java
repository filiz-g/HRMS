package project.hrms.entities.concretes;

import java.sql.Date;

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
	        private Date createdDate;
	     
		    @Column(name="is_verified")
	        private boolean isVerified;
		 
	    public JobTitle() {};

		public JobTitle(int id, String jobTitle, Date createdDate, boolean isVerified) {
			super();
			this.id = id;
			this.jobTitle = jobTitle;
			this.createdDate = createdDate;
			this.isVerified = isVerified;
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

}

