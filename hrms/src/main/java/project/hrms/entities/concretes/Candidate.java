package project.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User {
    
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name="is_verified")
	private boolean isVerified;

	

	public Candidate(String firstName, String lastName, String nationalityId, LocalDate dateOfBirth,
			boolean isVerified) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.isVerified = isVerified;
	}




	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getNationalityId() {
		return nationalityId;
	}



	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public boolean isVerified() {
		return isVerified;
	}



	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	
}
