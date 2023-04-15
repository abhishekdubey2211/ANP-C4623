package OOPS;

//Multi-Level Inhertance Example
class GrandFather{
	public GrandFather() {
		System.out.println("I am MR SHITLA PRASAD DUBEY and having son DINESH DUBEY ");
	}
}

class Father extends GrandFather{
	public Father() {
		System.out.println("I am MR DINESH KUMAR DUBEY and having son ABHISHEK DUBEY ");
	}
}
class Me extends Father{
	public Me() {
		System.out.println("I am MR ABHISHEK DUBEY \n    This is my Multi-Level Inhertance Example");
	}
}

public class Family extends Me {

	public static void main(String[] args) {
		Me abhi = new Me();
	}

}
