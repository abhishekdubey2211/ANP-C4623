package Loops;
import java.util.*;
public class FactorialCalculator {
//	function for calculating factorial
	public static int fact(int num) {
		int factorial = 1;
//		if entered an negative number
		if(num<0) {
			System.out.println("enter a valid possitive integer number");
			return factorial;
		}
		
		//factorial loop
		for(int i=num ; i>0; i--) {
			factorial = factorial*i;
			
		}
		System.out.printf("factorial of %d = %d  ",num,factorial);
		return factorial;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = sc.nextInt();
		
		//calling function fact() for calculating factorial
		fact(num);
	
	}
}

// functions are called directly
//methods are called using object whose method part is defined in another class
