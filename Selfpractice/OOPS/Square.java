package OOPS;

class Area2{
//	creating an instance variable
	int side;

//	calling variable though getter and setter
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
//		creating an printing method
		//	public void sqArea() {
		//	System.out.println("Side of a Square = "+ side);
		//	System.out.println("Area of a Square = "+ 4*side);
		//	System.out.println("Perimeter of a Square = "+ side*side);
		//}
	
}

public class Square {
	public static void main(String[] args) {
//		creating and object of a class
		Area2 as = new Area2();
		
//		using setter assigning vale
		as.setSide(35);

//		creating an printing statements
		System.out.println("Side of a Square = "+ as.side);
		System.out.println("Area of a Square = "+ 4*as.side);
		System.out.println("Perimeter of a Square = "+ as.side*as.side);
		
//		calling n printing method
		//		as.sqArea();
	}
}
