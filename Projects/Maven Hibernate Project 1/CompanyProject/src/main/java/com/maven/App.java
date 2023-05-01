package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao employeeDao = new EmployeeDao();
    	Scanner sc = new Scanner(System.in);
    	
    	//TAKING SIZE 
    	System.out.println("Enter the no of employee = ");
    	int size = sc.nextInt();
    	
    	// ARRAYS
    	String[] firstName = new String[size];
    	String[] lastName = new String[size];
    	String[] email = new String[size];
    	String[] department = new String[size];
    	long[] contact = new long[size];
    	Employee[] employeees = new Employee[size];
    	
    	//GATHERING DATA FROM USER AT ONCE
    	for(int i = 0 ; i<size ; i++) {
    		System.out.printf("Employee %d \n",i+1);
        	System.out.println("Enter your First name = ");
        	 firstName[i]=sc.next();
        	System.out.println("Enter your Last name = ");
        	 lastName[i]=sc.next();
        	System.out.println("Enter your email = ");
        	 email[i]=sc.next();
        	System.out.println("Enter your department = ");
        	 department[i]=sc.next();
        	System.out.println("Enter your mobile no = ");
        	 contact[i]=sc.nextLong();
        	 System.out.println("\n*******************************************\n");
        	}
    	
    	
    	for(int i = 0 ; i<size ; i++) 
    	{
   		  employeees[i] =new Employee( firstName[i],  lastName[i],  email[i],  department[i],  contact[i]) ;
    	}
   	
   	//SAVING ALL GATHERED DATA
   	for(int i = 0 ; i<size ; i++) {
   		employeeDao.saveEmployee(employeees[i]);
   	}
   	
  	for(int i = 0 ; i<size ; i++) {
  		System.out.println(firstName[i]);
  		if(firstName[i]=="pradeep") 
  		{
  			employeees[i].setFirstName("ABHISHEK");
  			employeeDao.updateEmployee(employeees[i]);
  		}
  		
  	}
   		
//   	 employeees[4] = employeeDao.getEmployeeById(employeees.getid()));
   		employeees[2].setFirstName("ABHISHEK");
   		employeeDao.updateEmployee(employeees[2]);
   	
        // test getAllEmployees
        List < Employee > employees = employeeDao.getAllEmployees();
        employees.forEach(employee4 -> System.out.println(employee4.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
//        CAN DELETE DATA  test deleteEmployee
        employeeDao.deleteEmployee(4);

    }
 }



