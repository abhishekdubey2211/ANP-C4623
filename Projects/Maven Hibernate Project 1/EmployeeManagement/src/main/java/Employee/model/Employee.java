package Employee.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
	
	@Column(name="Employee_First_Name")
	private String empname;
	
    @Column(name = "Employee_last_name")
    private String lastName;
    
    
    @Column(name = "Employee_email")
    private String email;
    
	@Column(name="Department")
	private String empdpart;
	
	@Column(name="Salary")
	private long salary;
}
