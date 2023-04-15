package OOPS;
import java.util.*;
//MultiLevel inheritance

class volume
{
	float radius;
	float height;
	
//	creating constructor
//	public volume(float radius, float height) {
//		super();
//		this.radius = radius;
//		this.height = height;
//	}



//	creating method
	public void Cylindervolume() 
	{
		System.out.println("Height of a Cylinder is "+ height);
		System.out.println("Height of a Cylinder is "+ radius);
		System.out.println("Volume of a Cylinder is "+ Math.PI*(radius*radius)*height);
	}
	
	
//	creating getter n setter
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
}

class SurfaceArea extends volume
{
//	public SurfaceArea(float radius, float height) {
//		super(radius, height);
//	}

	public void  CylinderSurfaceArea() 
	{
		System.out.println("Surface Area of a Cylinder is "+((2* Math.PI*radius*height)+2*Math.PI*(radius*radius)));
	}
}


class Circumferance extends SurfaceArea {
//	public Circumferance(float radius, float height) {
//		super(radius, height);
//	}

	public void CylinderCircumferance() 
	{
		System.out.println("Circumferance of a Cylinder is "+(2* Math.PI*radius*height));
	}
	
	
}

public class UserInputCylinder {
public static void main(String[] args) 
{
//	Circumferance cylinder =new Circumferance()25,30;
//	creating n object of subclass
	Circumferance cylinder =new Circumferance();
	
//	Taking input from user using scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Height of cylinder = ");
	float h = sc.nextFloat();
	System.out.println("Enter the Radius of cylinder = ");
	float r = sc.nextFloat();
	
//	assigning n printing 
	cylinder.setHeight(h);
	cylinder.setRadius(r);
	cylinder.Cylindervolume();
	cylinder.CylinderSurfaceArea();
	cylinder.CylinderCircumferance();
	
	}
}
