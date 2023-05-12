package com.employee;
import com.employee.dao.*;
import com.employee.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	Employee employee = new Employee();
    	employee.setFemp_name("abhishek");
    	employee.setLemp_name("Dubey");
    	employee.setContact(885001499);
    	employee.setEmail("abhi@gmail.com");
    	
    	EmployeeDetail employeeDetail = new EmployeeDetail();
    	employeeDetail.setAddress("chembur mumbai");
    	employeeDetail.setCity("mumbai");
    	employeeDetail.setState("Maharastra");
    	employeeDetail.setSalary(36000);
    	
    	
    	EmployeeDao employeedao = new EmployeeDao();
    	employeedao.saveEmployee(employee);
    	
    	EmployeeDetailDao employeeDetaildao = new EmployeeDetailDao();
    	employeeDetaildao.saveEmployeeDetail(employeeDetail);
    	
    	
    	
    	
    	
    }
}
