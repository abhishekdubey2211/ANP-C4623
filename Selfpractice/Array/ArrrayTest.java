package Array;
import java.util.*;

public class ArrrayTest {
	public static void main(String[] args) 
	{
//		int[]  marks = {56,76,45,67};
//		System.out.println("Printing ann arry at index no 3 = " +marks[3]);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array = ");
		int size = sc.nextInt();
		int[] marks = new int[size];

		System.out.println("Enter the array element = ");
		
		
		for(int i=0 ; i< size;i++) 
		{
			marks[i] = sc.nextInt();
		}
		//for print all elements of an array
		for(int i=0 ; i< size;i++) 
		{
			System.out.print(marks[i]);
			System.out.print(" , ");
		}
		
		
		System.out.println("\nEnter the element you want to search in array = ");
		int x =sc.nextInt();
		
		for(int i=0 ; i<size;i++) 
		{
			if(marks[i]==x) 
			{
				System.out.println("The element "+x+" is located at index "+i);
			}
		}
		
	}
}


