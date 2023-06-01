package student.model;

import java.util.Date;

//import java.sql.Date;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="Sr.No")	
	private int id;
	
	@Column(name="Seat_No")	
	private int rollno;
	
	@Column(name="First_Name")	
	private String fname;
	
	@Column(name="Middle_Name")	
	private String mname;
	
	@Column(name="Last_Name")	
	private String lname;
	
	@Temporal(TemporalType.DATE)	private Date date;
	@Transient		private int x;
	
	@Embedded
	private StudentDetails student_details;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_byID")
	private Address address;
}
