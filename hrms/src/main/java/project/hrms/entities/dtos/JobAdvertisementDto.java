package project.hrms.entities.dtos;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	
	private String title;
	private String companyName;
	private int openPositionCount;
	private Date createdDate;
	private Date deadline;

		

}
