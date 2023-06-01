package student.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Address {
	@Id
	@Column(name="Address")
	private String address;
	
	@Column(name="State")
	private String state;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Country")
	private String country;
	
	@OneToOne(mappedBy ="address")
	@JoinColumn(name="student_address_byID")
	private Student student;

}
