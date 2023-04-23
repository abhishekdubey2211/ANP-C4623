package Conditional;
import java.util.*;
public class Conditional 
{
	public static void calculator(int num2, int num3, String opp) {
		switch(opp) 
		{
			case "+" : System.out.println(num2 + " + "+num3 +" = " + (num2+num3));
		break;
			case "-" : System.out.println(num2 + " - "+num3 +" = " + (num2-num3));
		break;
			case "*" : System.out.println(num2 + " x "+num3 +" = " + (num2*num3));
		break;
			case "/" : System.out.println(num2 + " / "+num3 +" = " + (num2/num3));
		break;
		
		}
	}
	public static void vote(int age) {
		if (age>18) {System.out.println("YOU ARE ADULT YOU CAN VOTE !");}
		else {System.out.println("YOU ARE NOT ADULT  YOU CAN'T VOTE !");}
	}
	
	public static void evenodd(int num) {
		if(num%2==0) {System.out.println("you entered an even number");}
		else {System.out.println("You entered an odd number");}
	}

	public static void showpercent(int percent)
	{
		if(percent<35) {System.out.printf("your percentage is %d its lesser then passing criteria YOU ARE FAILED",percent);}
		else if(percent>35 && percent<60) {System.out.printf("your percentage is %d  You passed with SECOND CLASS RESULT",percent);}
		else if(percent>60 && percent<80) {System.out.printf("your percentage is %d You passed with FIRST CLASS RESULT",percent);}
		else if(percent>80 && percent<100) {System.out.printf("your percentage is %d You passed with DISTINCTION  RESULT",percent);}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		System.out.print("ENTER YOUR AGE = ");
//		int age = sc.nextInt();
//		vote(age);
//
//		System.out.println("ENTER ANY NUMBER = ");
//		int num = sc.nextInt();
//		evenodd(num);
//
//		
//		System.out.println("Enter your total SSC PERCENTAGE = ");
//		int percent = sc.nextInt();
//		showpercent(percent);  //method calling to display percentage result
		
		System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM = ");
		String opp = sc.nextLine();
		
		System.out.println("ENTER THE FIRST NUMBER = ");
		int num2=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER = ");
		int num3 = sc.nextInt();
		calculator(num2,num3,opp);
//		switch(opp) 
//		{
//			case "+" : System.out.println(num2 + " + "+num3 +" = " + (num2+num3));
//		break;
//			case "-" : System.out.println(num2 + " - "+num3 +" = " + (num2-num3));
//		break;
//			case "*" : System.out.println(num2 + " x "+num3 +" = " + (num2*num3));
//		break;
//			case "/" : System.out.println(num2 + " / "+num3 +" = " + (num2/num3));
//		break;
//		
//		}
	
		
	}
}
