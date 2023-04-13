package OOPS;

class Employee{
	int emp_id;
	String emp_name;
	int emp_batch;
	
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

	public void EmployeeDetail() {
		System.out.println("Employee id = "+emp_id+"  Employee Name = "+emp_name+"  Employee Batch no = "+emp_batch);
	}
}

public class CustomClass {
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setEmp_id(1233);
		e2.setEmp_id(2349);
		e3.setEmp_id(4568);
		
		e1.setEmp_name("Abhishek Dubey");
		e2.setEmp_name("Sachin");
		e3.setEmp_name("Amit");
		
		e1.setEmp_batch(233);
		e2.setEmp_batch(263);
		e3.setEmp_batch(933);
		
		e1.EmployeeDetail();
		e2.EmployeeDetail();
		e3.EmployeeDetail();

	}

}
