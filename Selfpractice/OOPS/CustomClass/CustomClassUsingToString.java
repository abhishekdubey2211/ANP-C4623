package OOPS;


class CustomClassemelents4{
	int age ;
	String name;
	float ssc_percent;
	
	public void display(float hsc_percent) {
		System.out.println("My name is "+name.toUpperCase()+" and prsently I'm "+age+" years of old");
		System.out.println("Mys HSC percentage is "+hsc_percent);
	}
	
	public CustomClassemelents4(int age, String name, float ssc_percent) {
		super();
		this.age = age;
		this.name = name;
		this.ssc_percent = ssc_percent;
	}

	@Override
	public String toString() {
		return "CustomClassemelents4 [age=" + age + ", name=" + name + ", ssc_percent=" + ssc_percent + "]";
	}
	
	
}
public class CustomClassUsingToString {
	public static void main(String[] args) {
		CustomClassemelents4 e = new CustomClassemelents4(56,"abhishek",86.40f);
		e.display(66.31f);
		System.out.println("I also achieved "+e.ssc_percent+"% i my SSC Examination");

	}	
}
