package corejava;

public class Person 
{
	//fields
	private String name;
	private int age;
	
//	creating getters and setters
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
	
	//CREATING display method for formate to display the content
	public void display() 
	{
		System.out.println("Name :"+getName()+"\nAge :"+getAge());
	}
}


