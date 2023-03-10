package corejava;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
	     //Creating a scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		//Creating a variable using scanner class object
		int number=sc.nextInt();
		//Checking condition
		if(number>0)
		{
			System.out.println("The number is positive");
		}
		else if(number<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
        sc.close();
        
	}

}
