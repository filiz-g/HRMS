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
@Table(name ="job_advert_confirm")
public class JobAdvertConfirm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "condirmed_date")
	private LocalDate confirmedDate;
	
	@OneToOne
	@JoinColumn(name ="job_advertisement_id")
	private JobAdvertisement jobAdvertisement;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public JobAdvertConfirm() {}

	public JobAdvertConfirm(int id, boolean isConfirmed, LocalDate confirmedDate, JobAdvertisement jobAdvertisement,
			Employee employee) {
		super();
		this.id = id;
		this.isConfirmed = isConfirmed;
		this.confirmedDate = confirmedDate;
		this.jobAdvertisement = jobAdvertisement;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public LocalDate getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(LocalDate confirmedDate) {
		this.confirmedDate = confirmedDate;
	}

	public JobAdvertisement getJobAdvertisement() {
		return jobAdvertisement;
	}

	public void setJobAdvertisement(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisement = jobAdvertisement;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

}
