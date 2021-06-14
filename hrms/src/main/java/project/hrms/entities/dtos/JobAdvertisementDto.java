package project.hrms.entities.dtos;

import java.time.LocalDate;

public class JobAdvertisementDto {
	
	private String title;
	private String companyName;
	private int openPositionCount;
	private LocalDate createdDate;
	private LocalDate deadline;
	
	public JobAdvertisementDto(String title, String companyName, int openPositionCount, LocalDate createdDate,
			LocalDate deadline) {
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

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

}
