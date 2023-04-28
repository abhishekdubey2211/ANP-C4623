package Conditional;
import java.util.*;
public class website_identifier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your website = ");
		String website = sc.next();
		
		if(website.endsWith(".org")) {
			System.out.println("this is an organizational website");
		}
		else if(website.endsWith(".in")) {
			System.out.println("this is an indian website");
		}
		else if(website.endsWith(".com")) {
			System.out.println("this is an commercial website");
		}
		else {
			System.out.println("evter the valid website");
		}
	}
	
}
