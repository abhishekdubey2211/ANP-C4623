package Conditional;
import java.util.*;
public class IfElse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter your physics marks : ");
	byte p1 = sc.nextByte();
	System.out.println("enter your biology marks : ");
	byte b1 = sc.nextByte();
	System.out.println("enter your chemistry marks : ");
	byte c1 = sc.nextByte();
	float percentage = ((p1+c1+b1)*100)/300;
	
	if (percentage>33) 
	{
		System.out.println("YOR ACHIVED PHYSICAS CHEMISTRY BIOLOGY PERCENTAGE IS = "+percentage+"%");
		System.out.println("you are sucessfully passed and promoted to 11th standard");
		if(percentage>60 && p1>40 && c1>40 && b1>40) {
			System.out.println("CONGURALATION you are even capable of appearing NEET examination for MEDICAL PREPERATION");
		}
	}
	else {
		System.out.println("YOR ACHIVED PHYSICAS CHEMISTRY BIOLOGY PERCENTAGE IS = "+percentage+"%");
		System.out.println("sorry your are failed n not capable of proceding forward reappear exam again");
	}
}
}
