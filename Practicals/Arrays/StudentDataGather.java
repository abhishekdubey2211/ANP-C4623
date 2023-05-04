package Array;
import java.util.*;
public class StudentDataGather {
	public static void main(String[] args) 
	{
		//GATTING STUDENT COUNT FROM USER
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students = ");
		int size = sc.nextInt();
		
		//CREATING ARRAYS
		int[] rollno = new int[size];
		String[] fname = new String[size];
		String[] lname = new String[size];
		int[] age = new int[size];
		float[] SSC = new float[size];
		
		//TAKING INPUTS FROM USER
		for(int i=0 ; i<size ; i++) {
			System.out.printf("\n*************STUDENT REGISTRATION NO %d******************",50053+i);
			System.out.println("\nRoll no : ");
			rollno[i] = sc.nextInt();
			System.out.println("Enter the First Name of Student = ");
			fname[i] = sc.next();
			System.out.println("Enter the Last Name of Student = ");
			lname[i] = sc.next();
			System.out.println("Enter the Age of Student = ");
			age[i] = sc.nextInt();
			System.out.println("Enter the SSC Percentage of Student = ");
			SSC[i] = sc.nextFloat();
		}
		
		//DISPLAYING OUTPUT
		for(int i=0 ; i<size ; i++) {
			System.out.printf("\n\n*************STUDENT REGISTRATION NO %d******************",50053+i);
			System.out.println("\nStudent Rollno = "+rollno[i]+"\nStudent Full Name = "+ fname[i]+" "+lname[i] +"\nStudent First Name = "+fname[i]+"\nStudent Last Name = "+lname[i]+"\nStudent Age = "+age[i]+"\nSSC Percentage = "+SSC[i]+"%");
		}
		
		//SEARCHING STUDENT DATA BY THEIR OLL NO
		System.out.print("\n\nSearch student detail by their roll no \nEnter the student Roll no  ");
		int find = sc.nextInt();
		for (int i=0; i<size; i++) {
			if(rollno[i]==find) 
			{
				System.out.printf("\n\n*************STUDENT REGISTRATION NO %d******************",50053+i);
				System.out.println("\nStudent Rollno = "+rollno[i]+"\nStudent Full Name = "+ fname[i]+" "+lname[i] +"\nStudent First Name = "+fname[i]+"\nStudent Last Name = "+lname[i]+"\nStudent Age = "+age[i]+"\nSSC Percentage = "+SSC[i]+"%");
			}
//			else {
//				System.out.println("Enter the valid Roll no   no such data found");
//			}
		}
	}
}
