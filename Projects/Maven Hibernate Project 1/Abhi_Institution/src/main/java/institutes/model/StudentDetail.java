package institutes.model;

import javax.persistence.*;
import lombok.*;

//@Entity
//@Table(name="studentDetails")
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class StudentDetail 
{
	
//	@Id
	@Column(name="SSC_PERCENTAGE")
		private float SSCpercent;
	
	@Column(name="HSC_PERCENTAGE")
		private float HSCpercent;
	
	@Column(name="SALARY")
		private float salary;
	
}