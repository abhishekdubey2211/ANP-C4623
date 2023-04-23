package Array;
import java.util.*;
public class Array {
	public static void main(String[] args) {
//		creating an array of marks of an students
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"ENGLISH","HINDI","MARATHI","SOCIAL SCIENCE","SCIENCE"};
		
		for (int i=0 ; i<subject.length;i++) 
		{
			System.out.print("Enter the marks of your "+ subject[i] +" subject = ");
			marks[i]=sc.nextInt();		
		}
		
		
		
		for (int i=0 ; i<marks.length;i++) 
		{
			System.out.println(subject[i] + " = " + marks[i]);
//			marks[i]=sc.nextInt();		
		}
		
		int sum = 0;

		for (int i = 0; i < marks.length; i++) {
		    sum += marks[i];
		}

		System.out.println("Total marks = " + sum);
		System.out.println("Percentage = " + ((sum*100)/500)+ "%");
		
		
	}
}
