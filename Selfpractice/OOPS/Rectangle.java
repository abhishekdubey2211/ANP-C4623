package OOPS;

class RecArea{
//	creating an instance variable of class
	private int l; // because of private access modifier we can't call variable in another class so we need to create constructor or getter and setter
	private int b;
	
//	creating an method
	public void recArea() 
	{
		System.out.println("Length of rectangle is = "+ l);
		System.out.println("Breath of rectangle is = "+ b);
		System.out.println("Area of rectangle is = "+ l*b);
	}
	public void recPerimeter() 
	{
		System.out.println("Perimeter of rectangle is = "+ 2*l+2*b);
	}
	
	
//	creating an constructor of class
	public RecArea(int l, int b) {
	super();
	this.l = l;
	this.b = b;
}


//	calling getter and setter
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}

public class Rectangle {
	public static void main(String[] args) 
	{
//		creating and object along with parameterized constructor
		RecArea ar = new RecArea(25,33);
		
//		calling the printing function
		ar.recArea();
		ar.recPerimeter();
	}
}
