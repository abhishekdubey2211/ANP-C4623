package OOPS;

// Abstract Class
abstract class PhonneFunction{ 
	PhonneFunction(){
		System.out.println("This is all CellPhone Functionality");
	}
	//no objects are able to create of an abstract class it can be created only if u define abstract methods in subclass
	// abstract class just helps to create common fundamental method with which innumerable subclass are able to implement as per requirement
	//Creating common functionality common to every cell phone  which any brand can use and use abstract method and implement as they want 
	public abstract void switchOff() ;  //abstract method helps in creation of concrete where other brand phone can implement class n function methed as they want
	public abstract void ringTone();	//using abstract method many concrete class
}

class SamsungFunctionality extends PhonneFunction{
	
	//we are overriding the abstract method
	@Override
	public void switchOff(){
		System.out.println("Welcome in samsung world");
	}
	@Override
	public void ringTone() {
		System.out.println("Samsung default song");
	}
}


class VivoFunctionality extends PhonneFunction{
	//we are overriding the abstract method
	@Override
	public void switchOff(){
		System.out.println("Welcome in Vivo world");
	}
	@Override
	public void ringTone() {
		System.out.println("Vivo default song");
	}
	
}
abstract class MIFunctionality extends PhonneFunction{
	//we are overriding the abstract method
	public void switchOff(){
		System.out.println("Welcome in MI world");
	}
	
}


public class CellPhone{
	public static void main(String[] args) {
//		PhonneFunction pf =new PhonneFunction();    // cant create an object of an abstract class
//		MIFunctionality Mf = new MIFunctionality();  // cant create an object of an abstract class
		SamsungFunctionality sf= new SamsungFunctionality();
		VivoFunctionality vf = new VivoFunctionality();

//		calling an concrete method    if abstract method is properly implement or defined then is referred as concrete method
		sf.switchOff();
		sf.ringTone();
		vf.switchOff();
		vf.ringTone();
	}
}
