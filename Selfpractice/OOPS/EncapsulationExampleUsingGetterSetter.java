package OOPS;

import java.util.*;


//Encapsulation  making super classs to be private and calling through getter and setter method
class SuperClass3{
	private String username;
	private String phone;
	private String brand;
	private int mobileno;
	


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getMobileno() {
		return mobileno;
	}


	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}


	public String getPhone() {
		return phone = "Smart Phone";
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
}

public class EncapsulationExampleUsingGetterSetter {

	public static void main(String[] args) {
		//object instantiating
		SuperClass3 sa = new SuperClass3();
		
		//taking input form user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name = ");
		String username= sc.nextLine();
		System.out.println("Enter the user brand = ");
		String brand= sc.nextLine();
		System.out.println("Enter the user mobileno = ");
		int mobileno= sc.nextInt();
		
		sa.setUsername(username);
		sa.setBrand(brand);
		sa.setMobileno(mobileno);
		
		System.out.println("USER NAME = "+sa.getUsername()+" \nPHONE TYPE = "+sa.getPhone()+" \nBRAND NAME ="+ sa.getBrand() +" \nMOBILE NO = "+ sa.getMobileno());
		
	}
}

