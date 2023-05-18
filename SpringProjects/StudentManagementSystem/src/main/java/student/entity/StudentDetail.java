package student.entity;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name="studentDetail")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
//	 @DecimalMin(value = "0.0", inclusive = false)
//	 @DecimalMax(value = "100.0")
//	@NotNull
//	 @Size(min = 0, max = 100)
	@Column(name="SSC_PERCENTAGE")
	private Float SSCpercent;
	
//	@NotNull
//	 @Size(min = 0, max = 100)	
	 @Column(name="HSC_PERCENTAGE")
	private float HSCpercent;
	
//	@NotNull
	@Column(name="SALARY")
	private float salary;
	
	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="student_id")
	private Student student;
	
	
}
