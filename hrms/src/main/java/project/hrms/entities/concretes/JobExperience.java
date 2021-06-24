package project.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_experiences")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@JsonIgnore
	@Column(name= "created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate=LocalDate.now();
	
	@Column(name = "end_date", nullable = true)
	private LocalDate endDate;
	
	@Column(name= "start_date")
	private LocalDate startDate;
	
	@JsonIgnore
	@Column(name= "is_active")
	private boolean isActive = true;
	
	@Column(name= "company_name")
	private String companyName;
	
	
	@Column(name= "position")
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	

}
