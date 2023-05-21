package OOPS;

//Custom Class in Java calling using Object
class CustomClassemelents{
	int age ;
	String name;
	float ssc_percent;

	
	public void display() {
		System.out.println("My name is "+name.toUpperCase()+" and prsently I'm "+age+" years of old");
	}
}

public class CustomClassUsingObject {
	
	public static void main(String[] args) {
		CustomClassemelents e = new CustomClassemelents();
		e.age =56;
		e.name = "abhishek";
		e.ssc_percent = 86.40f;

		e.display();
		System.out.println("I also achieved "+e.ssc_percent+"% i my SSC Examination");

	}
}
