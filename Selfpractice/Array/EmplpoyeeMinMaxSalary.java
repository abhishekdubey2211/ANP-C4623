package Array;
import java.util.*;
public class EmplpoyeeMinMaxSalary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.. of employees = ");
		int size = sc.nextInt();
		
		//ARRAY DECLARATION
		long[] salary = new long[size];
		String[] name = new String[size];
		// GATHERING DATA
		for(int i=0 ; i<size;i++) 
		{
			System.out.printf("enter the Name for employe id %d = ",(10050+i));
			name[i] = sc.next();
			System.out.printf("enter the salary for employe id %d = ",(10050+i));
			salary[i] = sc.nextLong();
			System.out.println("\n****************************\n");
		}
		
		// FOR MINIMUM AND MAXIMUM SALARY CALCULATION
		 long max = Integer.MIN_VALUE;
	      long min = Integer.MAX_VALUE;
	      String emp_name1=null ;
	      String emp_name=null ;
	      int emp_id_min = 0;
	      int emp_id_max = 0;
		
		for(int i=0 ; i<size;i++) 
		{
			 if(salary[i] < min) {
	               min = salary[i];
	               emp_name1=name[i];
	               emp_id_min=(10050+i);
	             
	           }
	           if(salary[i] > max) {
	               max = salary[i];
	               emp_name = name[i];
	               emp_id_max=(10050+i);
	            
	           }
		}
		
		//DISPLAYING DATA
		for(int i=0 ; i<size;i++) 
		{
			System.out.printf("employee id = %d\nEmployee name = %s \nEmployee Salary = %d\n*********************\n",(i+10050),name[i],salary[i]);
			
		}

		  System.out.printf("Employee %d %s having minimum salary %d/-\nEmployee %s having maximum salary %d/-",emp_id_min,emp_name1,min,emp_id_max,emp_name,max);
		  
	}
	
}

