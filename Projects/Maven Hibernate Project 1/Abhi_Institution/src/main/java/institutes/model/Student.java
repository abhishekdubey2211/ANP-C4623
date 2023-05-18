package institutes.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="student")
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=3, unique = true ,name="Roll_no")
		private int rollno;
	
	@Column(nullable = false , name="First_name")
		private String Fname;
	
	@Column(nullable = false , name="Last_Name")
		private String Lname;
	
	 @Column(nullable = false, unique = true, length = 50)
	    private String email;
	
	 @Embedded
	 private StudentDetail studentDetail;

	public Student(int rollno, String fname, String lname, String email) {
		super();
		this.rollno = rollno;
		Fname = fname;
		Lname = lname;
		this.email = email;
	}
	 
	 
	 
	
	 
	
	 
	}
	 
	 



