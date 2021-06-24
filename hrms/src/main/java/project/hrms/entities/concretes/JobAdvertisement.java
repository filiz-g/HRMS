package project.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonIgnore
	@Column(name="created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();
	
	@JsonIgnore
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="description")
	private String description;
	
	@Column(name="open_positon_count")
	private int openPositionCount;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name="published_at")
	private LocalDate publishedAt;
	
	@ManyToOne
	@JoinColumn(name = "employer_id",referencedColumnName = "user_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;
	
	@ManyToOne
	@JoinColumn(name = "work_hour_id")
	private WorkHour workHour;

	@ManyToOne()
	@JoinColumn(name = "work_type_id")
	private WorkType workType;
	
	
}
