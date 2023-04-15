package OOPS;

class Papa{
	public void Papa1(){
		System.out.println("I am MR DINESH KUMAR DUBEY having two chids");
	}
}

class Abhi extends Papa{
	public void Abhi1_1() {
		System.out.println("I am ABHISHEK DUBEY son OF MR DINESH KUMAR DUBEY \n");
	}
}

class AMIT extends Papa{
	public void AMIT1_2() {
		System.out.println("I am SMIT DUBEY son OF MR DINESH KUMAR DUBEY ");
	}
}

public class HierarchicalFamily {
	public static void main(String[] args) {
		Abhi abhi = new Abhi();
		abhi.Papa1();
		abhi.Abhi1_1();
	
		
		AMIT amit =new AMIT();
		amit.Papa1();
		amit.AMIT1_2();
	
	}
}
