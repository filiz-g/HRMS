package project.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="email_adress")
	private String emailAddress;
	
	@Column(name="password")
	private String password;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="cretaed_date")
	private Date createdDate;
	
	
	public User() {}


	public User(int id, String emailAddress, String password, boolean isActive, Date createdDate) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.password = password;
		this.isActive = isActive;
		this.createdDate = createdDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	
	

}
