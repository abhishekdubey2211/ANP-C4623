package Loops;
import java.util.*;
public class PrintingEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number u cant to check enven or odd = ");
		int evenodd = sc.nextInt();
		
		if(evenodd%2==0) {
			System.out.printf("%d is an even number",evenodd);
		}else {
		System.out.printf("%d is an odd number",evenodd);
	}
		
		
		System.out.println("\nprint odd no till where = ");
		int b = sc.nextInt();
		
		
		System.out.println("using for loop");
		for(int i=b -1 ; i>0;i--) {
			System.out.println("odd no = "+(2*i+1));
		}
		
		
		System.out.println("using while loop");
		int i=0 ; 
		while(i<b) {
			System.out.println("odd no = "+(2*i+1));
			i++;
		}
		
		System.out.println("using do-while loop");
		int i1=0 ;
		do {
			System.out.println("odd no = "+(2*i1+1));
			i1++;
		}
		while(i1<b);
		
	}

}
