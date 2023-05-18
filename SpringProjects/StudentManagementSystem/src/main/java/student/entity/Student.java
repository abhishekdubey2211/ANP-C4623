package student.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;

@Entity
@Table(name="student")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(name="First_Name")
	private String fname;
	
	@NotNull
	@Column(name="Last_Name")
	private String lname;
	
	@NotNull
	@Email
	@Column(name="Email_ID")
	private String semail;
	
	@NotNull
//	@Size(max=10)
	@Column(name="Contact_NO")
	private long contact;
	
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL,mappedBy = "student")
	@JoinColumn(name="Student_detail_id")
	private StudentDetail studentDetail;
}
