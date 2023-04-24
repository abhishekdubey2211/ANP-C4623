package Array;
import java.util.*;
import java.util.Scanner;

public class StudentsDataEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students you have in class : ");
		int size = sc.nextInt();
		String[] name = new String[size];
		int[] age = new int[size];
		int[] Rollno = new int[size];
		
		for(int i=0; i<size ; i++) {
			 System.out.println("Enter details for student " + (i+1) + ":");
	            System.out.print("Student Name: ");
	            name[i] = sc.next();
	            System.out.print("Student Roll No: ");
	            Rollno[i] = sc.nextInt();
	            System.out.print("Student Age: ");
	            age[i] = sc.nextInt();
		}
		
		System.out.println("Student Information:");
        for (int i = 0; i < size; i++) {
            System.out.println("Student" + (i+1) + ": " + name[i] + " (Roll No: " + Rollno[i] + ", Age: " + age[i] + ")");
        }	
	}
}
