package project.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
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
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;
	
	@OneToOne(mappedBy ="jobAdvertisement")
	private JobAdvertConfirm jobAdvertConfirm;

	public JobAdvertisement() {}
	
	public JobAdvertisement(int id, LocalDate createdDate, boolean isActive, String description, int openPositionCount,
			LocalDate deadline, boolean isOpen, int salaryMin, int salaryMax, LocalDate publishedAt, Employer employer, City city,
			JobTitle jobTitle, JobAdvertConfirm jobAdvertConfirm) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.description = description;
		this.openPositionCount = openPositionCount;
		this.deadline = deadline;
		this.isOpen = isOpen;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.publishedAt = publishedAt;
		this.employer = employer;
		this.city = city;
		this.jobTitle = jobTitle;
		this.jobAdvertConfirm = jobAdvertConfirm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public int getSalaryMin() {
		return salaryMin;
	}

	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}

	public int getSalaryMax() {
		return salaryMax;
	}

	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}

	public LocalDate getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDate publishedAt) {
		this.publishedAt = publishedAt;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public JobAdvertConfirm getJobAdvertConfirm() {
		return jobAdvertConfirm;
	}

	public void setJobAdvertConfirm(JobAdvertConfirm jobAdvertConfirm) {
		this.jobAdvertConfirm = jobAdvertConfirm;
	}
	
	
	
	

}
