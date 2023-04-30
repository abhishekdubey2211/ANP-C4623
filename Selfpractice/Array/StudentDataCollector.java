package Array;
import java.util.*;
public class StudentDataCollector {
	public static void main(String[] args) {
		// one Dimensional array
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO OF STUDENTS IN CLASSROOOM = ");
		int nostu = sc.nextInt();
		
		String[] name = new String[nostu];
		int[] age = new int[nostu];
		int[] studentid = new int[nostu];
		
		for (int i=1 ; i<nostu ; i++) 
		{
			 System.out.println("Enter details for student " + i + ":");
			 System.out.println("Roll no = "+ i);
			System.out.println("Enter the Name of the Student = ");
			 name[i] = sc.next();
			 System.out.println("Enter the Age of the Student = ");
			 age[i] = sc.nextInt();
			 System.out.println("Enter the Student ID no. of the Student = ");
			 studentid[i] = sc.nextInt();
		}
		
		
		
		for (int i=1 ; i<nostu ; i++) 
		{
			System.out.println("Student "+i+" : \n"+"Roll no = "+ i+"  \nStudent Name = "+name[i]+"  \nStudent Age = "+age[i] +"  \nStudent ID no. = "+studentid[i]+"   \n\n**********************************\n");
		}
		
	}

}
