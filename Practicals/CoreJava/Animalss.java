package corejava;

 interface Animalss 
{
public void sound();//Interface method() without body...
}
class Monkey implements Animalss//Creating class Monkey 
{
	public void sound()//Body of interface method sound
	{
		System.out.println("Monkey ......");
	}
}
class Main9//Creating class with main method()
{
	public static void main(String[] args)
	{
		Monkey m= new Monkey();//Creating object of class Monkey
		m.sound();//Calling method() of interface		
	}
}