package student.entity;

import javax.persistence.*;
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

//	@NotNull
	@Column(name="COUESE")
	private String course;

	
//	@NotNull
	@Column(name="Higest_Qualification",length=20)
	private String qualification;
	
	@Column(name="CGPA",length=8)
	private long cgpa;
	
	
}
