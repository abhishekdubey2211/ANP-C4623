package Operators;
import java.util.Scanner;

public class LogicalOperator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first No :");
		int num1=sc.nextInt();
		System.out.println("Enter the Second No :");
		int num2=sc.nextInt();
		
		//both the numbers are even
		if(num1 % 2==0 && num2 % 2==0)
		{
			System.out.println("Both numbers are Even");
		}
		else
		{
			System.out.println("Atleast one Number is odd");
		}
		
		//Check if either number is negative
		if(num1 < 0 || num2 < 0) 
		{
			System.out.println("Atleast one number is negative");
		}
		else
		{
			System.out.println("Both numbers are non-negative");
		}
		
		//to check the equality of entered number
		if(num1 == num2 ) 
		{
			System.out.println("Both the Enterend values are Equal");
		}
		else
		{
			System.out.println("Both the Entered values are Unequal");
		}
	}

}