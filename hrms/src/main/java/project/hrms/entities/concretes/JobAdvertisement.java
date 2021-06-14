package project.hrms.entities.concretes;

import java.sql.Date;

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
	private Date createdDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="description")
	private String description;
	
	@Column(name="open_title_count")
	private int openTitleCount;
	
	@Column(name="deadline")
	private Date deadline;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name="published_at")
	private Date publishedAt;
	
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
	
	public JobAdvertisement(int id, Date createdDate, boolean isActive, String description, int openTitleCount,
			Date deadline, boolean isOpen, int salaryMin, int salaryMax, Date publishedAt, Employer employer, City city,
			JobTitle jobTitle, JobAdvertConfirm jobAdvertConfirm) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.description = description;
		this.openTitleCount = openTitleCount;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
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

	public int getOpenTitleCount() {
		return openTitleCount;
	}

	public void setOpenTitleCount(int openTitleCount) {
		this.openTitleCount = openTitleCount;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
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

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
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
