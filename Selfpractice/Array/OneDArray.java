package Array;
import java.util.*;
public class OneDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array  = ");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		for (int i=0 ; i<size;i++) {
			System.out.printf("Enter the %d of an array = ",i);
			numbers[i]= sc.nextInt();
		}
		
		System.out.println("Enter the element you wat to search = ");
		int find =sc.nextInt();
		
		for (int i=0;i<size;i++) {
			if(numbers[i]==find) {
				System.out.printf("The element %d as found at index %d \n",find,i);
			}
		}
		
		for (int i=0;i<size;i++) {
			System.out.print("numbers["+i+"] = "+numbers[i]+" ");
	}
	
	}
}
