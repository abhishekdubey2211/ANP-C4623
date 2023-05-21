package OOPS;

class A{
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void displayheader() {
		String a="Exmple for inheritable of variable in java";
		System.out.println(a.toUpperCase());
	
	
	}
	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

class B extends A{
	int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	public B(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void display() {
		System.out.println("Inside class A       x = "+x);
		System.out.println("Inside class A       y = "+y);
		System.out.println("Inside class B       z = "+z);
		System.out.println("HERE CLASS B IS INHERITING VARIABLES INDE CLASS A");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B b = new B(48,85,95);
		b.displayheader();
		b.display();
		
		
		
	}
}
