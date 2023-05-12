package Student.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	@Column(name="Student_First_Name")
	private String sname;
	
	@Column(name="Student_Last_Name")
	private String lname;
	
	@Column(name="SSC_percentage")
	private float ssc_percent;
	
	@Column(name="Email_ID")
	private String email;	
	
	@Column(name="Contact_no")
	private long contact;
}
