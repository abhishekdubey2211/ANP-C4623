package OOPS;


class CustomClassemelents2{
	int age ;
	String name;
	float ssc_percent;
	
//adding Getter Setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSsc_percent() {
		return ssc_percent;
	}
	public void setSsc_percent(float ssc_percent) {
		this.ssc_percent = ssc_percent;
	}
	
	public void display(float hsc_percent) {
		System.out.println("My HSC percentage is "+hsc_percent);
	}
}


public class CustomClassUsingGetterSetter {
	public static void main(String[] args) {
		CustomClassemelents2 e = new CustomClassemelents2();
		e.setAge(56);
		e.setName("abhishek");
		e.setSsc_percent(86.40f);
		System.out.println("My name is "+e.getName().toUpperCase()+" and prsently I'm "+e.getAge()+" years of old");
		System.out.println("I also achieved "+e.getSsc_percent()+"% i my SSC Examination");	
		e.display(66.30f);

	}	
}
