
//JPA- Java Persistence API
//JPA entity class
//@Entity- It identifies a class as an entity class
//@Table- It specifies he table in the database
//@Id- define the mapping to the primary key
//@GeneratedValue-used to automatically generate the primary key value

package com.maven.model;
import javax.persistence.*;
@Entity  
@Table(name = "employee")
public class Employee 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Employee_first_name")
    private String firstName;

    @Column(name = "Employee_last_name")
    private String lastName;

    @Column(name = "Employee_email")
    private String email;
    
    @Column(name = "Employee_department")
    private String department;
    
    @Column(name = "Employee_contact")
    private long contact;

  //default constructor
	public Employee() 
	{
		
	}

	//parameterized constructor
public Employee(String firstName, String lastName, String email, String department, long contact) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.department = department;
	this.contact = contact;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", department="
			+ department + ", contact=" + contact + "]";
}




}
 

	