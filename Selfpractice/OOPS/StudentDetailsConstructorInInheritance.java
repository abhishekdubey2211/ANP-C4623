package OOPS;
import java.util.*;

class PersonalDetail{
	String name;
	int age;
	
	PersonalDetail(){
		System.out.println("YOU DIDN'T PASS DETAIL SO YOU CANT GET DETAILS ");
	}
	
	public PersonalDetail(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

class Educational extends PersonalDetail{
	float SSC;
	float HSC;
	
	public Educational(String name, int age, float sSC, float hSC) {
		super(name, age);
		SSC = sSC;
		HSC = hSC;
		System.err.println("Student Name = "+name+"\nStudent  Age = "+age+"\nStudent SSC Percentage = "+SSC+"% \nStudent  HSC percentage"+HSC+"%");
	}

	public Educational() {
		super();
	}
}
public class StudentDetailsConstructorInInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name = ");
		String name = sc.nextLine();
		System.out.println("Enter your age = ");
		int age = sc.nextInt();
		System.out.println("Enter your SSC percentage = ");
		float SSC = sc.nextFloat();
		System.out.println("Enter your HSC percentage = ");
		float HSC = sc.nextFloat();
		
		Educational detail = new Educational(name,age,SSC,HSC);
		
	}
}
