package corejava;

class Animal {
//method 
	public void display()
	{
		System.out.println("Inside parent class");
	}
}
//child class
class Dog extends Animal
{
public void sound()
{
	System.out.println("Barks...");
}
}
class Puppy extends Dog
{
	public void run()
	{
		System.out.println("He runs by small steps...");
	}
}
class Tester1
{
	public static void main(String[] args)
	{
		Puppy d=new Puppy();//creating object of child class 
		d.display();
		d.sound();
		d.run();
	}
}