package corejava;

//creating class so it inherits the animals class 

public class Dog extends Animals
{

	
	//creating parameterized constructor
	public Dog(int age) {
		super(age);
		this.age = age;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}

}
