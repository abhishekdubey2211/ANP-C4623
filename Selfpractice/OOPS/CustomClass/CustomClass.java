package OOPS;

public class CustomClass {
	static int age ;           //use static keyword
	static String name;
	static float ssc_percent;
	
	public static void display() {
		System.out.println("My name is "+name.toUpperCase()+" and prsently I'm "+age+" years of old");
	}
	
	public static void main(String[] args) {
		age=45;
		name = "abhishek";
		ssc_percent = 86.40f;
		display();
		System.out.println("I also achieved "+ssc_percent+"% i my SSC Examination");
	}
}


