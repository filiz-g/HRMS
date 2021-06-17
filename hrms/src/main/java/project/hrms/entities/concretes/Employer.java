package project.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User {
	

	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddres;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified")
	private boolean isVerified ;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

	
	public Employer() {}

	
	public Employer(String companyName, String webAddres, String phoneNumber, boolean isVerified,
			List<JobAdvertisement> jobAdvertisements) {
		super();
		this.companyName = companyName;
		this.webAddres = webAddres;
		this.phoneNumber = phoneNumber;
		this.isVerified = isVerified;
		this.jobAdvertisements = jobAdvertisements;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAddres() {
		return webAddres;
	}

	public void setWebAddres(String webAddres) {
		this.webAddres = webAddres;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public List<JobAdvertisement> getJobAdvertisements() {
		return jobAdvertisements;
	}

	public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}

}
