package corejava;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// Creating Scanner to take input from user
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number between 1 to 10");
		 a=sc.nextInt();
		while(a<1 || a>10)
		{
			System.out.println("Invalid Input Please Enter a number between 1 and 10");
			System.out.println("Enter a number between 1 to 10");
			 a=sc.nextInt();
		}
            System.out.println("You Enter a number:"+ a);
	}

}