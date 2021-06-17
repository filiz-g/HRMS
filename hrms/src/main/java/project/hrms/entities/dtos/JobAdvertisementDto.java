package project.hrms.entities.dtos;

import java.sql.Date;

public class JobAdvertisementDto {
	
	private String title;
	private String companyName;
	private int openPositionCount;
	private Date createdDate;
	private Date deadline;
	
	public JobAdvertisementDto(String title, String companyName, int openPositionCount,Date createdDate,
		Date deadline) {
		super();
		this.title = title;
		this.companyName = companyName;
		this.openPositionCount = openPositionCount;
		this.createdDate = createdDate;
		this.deadline = deadline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
