package Employee.dao;

import java.util.List;

import Employee.model.Employee;

public interface IEmployeeDao {

	void saveEmployee(Employee employee);

	void updateEmployee(Employee employee);

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployees();

	void deleteEmployee(int id);

}