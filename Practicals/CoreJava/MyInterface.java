package corejava;

interface  MyInterface {
	public void doSomething();
}
class MyClass implements  MyInterface
{
	public void doSomething() 
	{
		System.out.println("interface example");
	}
}
class MyMain
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.doSomething();
	}
}
