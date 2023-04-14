package OOPS;
import java.util.*;

public class Student {
	public static void main(String[] args) 
	{	
//		creating Scanner object
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the age of the student: ");
		int age = sc.nextInt();
		System.out.print("Enter the name of the student: ");
		String name = sc.next();
		
		
		System.out.println("Student name = "+name+" Age = "+age);
	}
}
	
