package OOPS;
import java.util.*;


//Encapsulation  making super classs to be private and ca;lling through constructor method
class SuperClass2{
	private String username;
	private String phone;
	private String brand;
	private int mobileno;
	
	
	//constructor with parameter string in it
	public SuperClass2(String phone) {
		this.phone = "SmartPhone";
	}


	//method creation
	public void userdetail(String username,String brand,int mobileno) {
		System.out.println("USER NAME = "+username+" \nPHONE TYPE = "+phone+" \nBRAND NAME ="+ brand +" \nMOBILE NO = "+ mobileno);
	}
}

public class EncapsulationExampleUsingConstructor {
	public static void main(String[] args) {
		//object instantiating
		SuperClass2 sa = new SuperClass2("Smart Phone");
		
		//taking input form user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name = ");
		String name= sc.nextLine();
		System.out.println("Enter the user brand = ");
		String brand= sc.nextLine();
		System.out.println("Enter the user mobileno = ");
		int mobileno= sc.nextInt();
		
		//calling userdetail method
		sa.userdetail(name, brand, mobileno);
	}
}
