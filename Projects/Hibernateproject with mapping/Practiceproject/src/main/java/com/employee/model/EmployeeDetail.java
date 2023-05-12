package com.employee.model;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name="employeeDetail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	
	@Column(name="Address")
		private String address;
	
	@Column(name="Cioty")
		private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="Salary")
		private long salary ;
	
	

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_ID")
    private Employee employee;
}
