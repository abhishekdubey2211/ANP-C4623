package corejava;

public abstract class Animals 
{
	//fields
	protected int age;

	
	//creating parameterized constructor
	public Animals(int age) {
		super();
		this.age = age;
	}

	
	//creating getter and setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}