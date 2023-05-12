package com.employee.model;

import javax.persistence.*;


import lombok.*;


@Entity
@Table(name="employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	
	@Column(name="First_name")
		private String femp_name;
	
	@Column(name="Last_name")
		private String lemp_name;
	

	@Column(name="Email")
		private String email;
	
	@Column(name="Contact")
		private long contact ;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_detail_ID")
    private EmployeeDetail employeeDetail;

}
