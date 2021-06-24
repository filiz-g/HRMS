package project.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyIntilazier","handler","jobAdvertisements"})
@Table(name="job_titles")
public class JobTitle {
	

		    @Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    @Column(name="id")
	        private int id;

		    @Column(name="title")
	        private String jobTitle;

		    @JsonIgnore
		    @Column(name="created_date" ,columnDefinition = "Date defult CURRENT_DATE")
	        private LocalDate createdDate = LocalDate.now();
	     
		    @JsonIgnore
		    @Column(name="is_active")
	        private boolean isActive=true;
		    
		    @OneToMany(mappedBy = "jobTitle")
			private List<JobAdvertisement> jobAdvertisements;
			
		 
	  
		
}

