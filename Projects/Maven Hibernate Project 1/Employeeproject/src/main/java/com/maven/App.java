package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao employeeDao = new EmployeeDao();

        //GATHERING EMPLOYEES DATA
        Employee employee =new Employee("amit","DUBEY","abhi@gmail.com","IT",885014799);
        Employee employee1 =new Employee("SACHIN","DUBEY","amit@gmail.com","SALES",885001499);
        Employee employee2 =new Employee("ANJU","PRAJAPATI","anju@gmail.com","java developer",526548565);
        Employee employee3 =new Employee("SANKEY","TRIPATHI","SANKEET@gmail.com","ACCOUNT",526475485);
        
        //passing value in parameterized constructor     FOR SAVING EMPLOYEES DATA
        employeeDao.saveEmployee(employee);
        employeeDao.saveEmployee(employee1);
        employeeDao.saveEmployee(employee2);
        employeeDao.saveEmployee(employee3);
        
        
        // test updateEmployee
        employee.setFirstName("ABHISHEK");
        employeeDao.updateEmployee(employee);
        
        // test getEmployeeById
//        Employee employee4 = employeeDao.getEmployeeById(employee.getId());

        
        // test getAllEmployees
        List < Employee > employees = employeeDao.getAllEmployees();
        employees.forEach(employee4 -> System.out.println(employee4.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteEmployee
//        employeeDao.deleteEmployee(2);

    }
 }



