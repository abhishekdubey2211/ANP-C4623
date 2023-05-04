package Patient.model;
import java.sql.Date;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="patient")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=60 , name= "Hospital_name ")
	private String hname;
	
	@Column(length=30 , name= "Patient_name")
	private String pname;
	
	@Column(name= "Bed_no")
	private int bedno;
	
	
//	@Temporal(TemporalType.DATE)
//	@Column(name= "Admited_date")
//	private int admitdate;
	
	@Column(name= "Contact_no")
	private long contact;

	public void setAdmitdate(java.util.Date date) {
		// TODO Auto-generated method stub
		
	}
}
