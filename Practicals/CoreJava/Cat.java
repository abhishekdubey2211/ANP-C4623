package corejava;

//creating class so it inherits the dog class 
public class Cat extends Dog
{
	//creating parameterized constructor
	public Cat(int age) {
		super(age);
		this.age = age;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}

}
