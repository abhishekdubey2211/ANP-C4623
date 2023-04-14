package OOPS;
import java.util.*;

class StudentDetials{
	private String name;
	private int age;
	
	public void detail() {
		System.out.println("student Name = "+name +"  Age = "+age);
	}

//	getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//
////	creating class constructor
//	public StudentDetials(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	
}

class StudentSSC_percentage extends StudentDetials
{
	int percentage;
//	
//	public StudentSSC_percentage(String name, int age,int percentage) {
//		super(name, age);
//		this.percentage = percentage;
//	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
}


public class Students {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentSSC_percentage sd = new StudentSSC_percentage();
		
		System.out.println("Enter the name of Student = ");
		String name = sc.nextLine();
		System.out.println("Enter the age of Student = ");
		int age = sc.nextInt();
		System.out.println("Enter your SSC Percentage  = ");
		int percentage = sc.nextInt();
		
		sd.setAge(age);
		sd.setName(name);
		sd.setPercentage(percentage);
		
		System.out.println("student Name = "+sd.getName() +"  Age = "+sd.getAge()+" Ahieved "+sd.getPercentage()+"% in SSC EXAMINATION");
	}
}
