package OOPS;
import java.util.*;
class Calculate{
	int side;
	
	//method for area of square
	public void area() {
		System.out.println("Area of Square is "+side*side);
	}
	//method for parameter of square
	public void perimeter() {
		System.out.println("Area of Square is "+4*side);
	}
	
}
public class CustomClassSquare {
public static void main(String[] args) {
	Calculate c = new Calculate();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of side of square = ");
	int side = sc.nextInt();
	
	c.side=side;
	c.area();
	c.perimeter();
	
	}
}
