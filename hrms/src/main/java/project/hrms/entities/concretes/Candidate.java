package project.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="candidates")
public class Candidate extends User {
    
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="is_verified")
	private boolean isVerified;

	

	public Candidate(int id, String firstName, String lastName, String nationalityId, Date dateOfBirth,
			boolean isVerified) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.isVerified = isVerified;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public Date getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public boolean isVerified() {
		return isVerified;
	}



	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	
}
