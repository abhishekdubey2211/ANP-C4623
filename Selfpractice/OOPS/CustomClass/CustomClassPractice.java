package OOPS;
public class CustomClassPractice {
	int age ;
	String name;
	float ssc_percent;
	float hsc_percent;
	
    
	public CustomClassPractice(int age, String name, float ssc_percent, float hsc_percent) {
		super();
		this.age = age;
		this.name = name;
		this.ssc_percent = ssc_percent;
		this.hsc_percent = hsc_percent;
	}

 	@Override
	public String toString() {
		return "CustomClassPractice [age=" + age + ", name=" + name + ", ssc_percent=" + ssc_percent + ", hsc_percent="
				+ hsc_percent + "]";
	}
	
	
    public static void main(String[] args) {
        CustomClassPractice person = new CustomClassPractice(56,"abhishek",86.40f,66.31f);
        System.out.println(person); // Automatically calls toString()
    }
}