package OOPS;

class Employee // ONE JAVA FILE CAN HAVE ONLY ONE PUBLIC ACESS MODIFIER 
{
	//INSTANCE VARIABLE DECLARATION OR ATTRIBUTES
	private int emp_id; 
	private String emp_name;
	private int emp_batch;
	private int salary;
	
	
//	getting input using getter and setter method
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_batch() {
		return emp_batch;
	}
	public void setEmp_batch(int emp_batch) {
		this.emp_batch = emp_batch;
	}
	public int getSalary(int salary) {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
//	creating printing method 
	public void EmployeeDetail() {
		System.out.println("Employee id = "+emp_id+"  Employee Name = "+emp_name+"  Employee Batch no = "+emp_batch +"  Salary = "+salary);
	}
}

public class CustomClass 
{
	public static void main(String[] args) 
	{
//		creating an objects for employee class
		Employee e1 = new Employee();  //creating an object for employee class
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//setting values in getter and setter
		e1.setEmp_id(1233);
		e2.setEmp_id(2349);
		e3.setEmp_id(4568);
	
		e1.setEmp_name("Abhishek Dubey");
		e2.setEmp_name("Sachin Yadav");
		e3.setEmp_name("Amit Dubey");
		
		e1.setEmp_batch(652);
		e2.setEmp_batch(632);
		e3.setEmp_batch(6658);
		
		e1.setSalary(45000);
		e2.setSalary(55000);
		e3.setSalary(85000);
		
		//calling printing method
		e1.EmployeeDetail();
		e2.EmployeeDetail();
		e3.EmployeeDetail();

	}
}
