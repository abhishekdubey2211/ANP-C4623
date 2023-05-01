//interface used to define the methods
//Employee - Entity class
//employee- object of entity class Employee
//List - interface 
package com.maven.dao;

import java.util.List;

import com.maven.model.Employee;

public interface IEmployeeDao 
{
	void saveEmployee(Employee employee);

	void updateEmployee(Employee employee);

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployees();

	void deleteEmployee(int id);
}
