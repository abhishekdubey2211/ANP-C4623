package Employee;

import java.util.List;
import Employee.dao.*;
import Employee.model.*;


public class App 
{
    public static void main( String[] args )
    {
    	IEmployeeDao employeeDao = new EmployeeDao();

        //GATHERING EMPLOYEES DATA
        Employee employee =new Employee(1, "amit","DUBEY","abhi@gmail.com","IT",25000);
        Employee employee1 =new Employee(2,"SACHIN","DUBEY","amit@gmail.com","SALES",45000);
        Employee employee2 =new Employee(3,"ANJU","PRAJAPATI","anju@gmail.com","java developer",36000);
        Employee employee3 =new Employee(4,"SANKEY","TRIPATHI","SANKEET@gmail.com","ACCOUNT",12500);
        
        //passing value in parameterized constructor     FOR SAVING EMPLOYEES DATA
        employeeDao.saveEmployee(employee);
        employeeDao.saveEmployee(employee1);
        employeeDao.saveEmployee(employee2);
        employeeDao.saveEmployee(employee3);
        
        
        // test updateEmployee
        employee.setEmpname("ABHISHEK");
        employeeDao.updateEmployee(employee);
        
        // test getEmployeeById
//        Employee employee4 = employeeDao.getEmployeeById(employee.getId());

        
        // test getAllEmployees
        List < Employee > employees = employeeDao.getAllEmployees();
        employees.forEach(employee4 -> System.out.println(employee4.getEmpid()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteEmployee
//        employeeDao.deleteEmployee(2);
    }
}
