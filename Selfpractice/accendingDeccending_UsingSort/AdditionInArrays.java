package Array;
import java.util.*;
public class AdditionInArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY  = ");
		int size = sc.nextInt();
	
		//creation of an array
		float number[] = new float[size];
		
		//input
		for(int i=0 ; i<size ; i++) 
		{
			System.out.printf("%s = ",i);
			number[i]= sc.nextFloat();
		}
		
		//output
		for(int i=0 ; i<size ; i++) 
		{
			System.out.printf("%.2f , ",number[i]," ");
		
		}
		
		//output in reverse order
		System.out.println("printing in reverse order");
		for(int i=size -1 ; i>0 ; i--) 
		{
			System.out.printf("%.2f , ",number[i]," ");
		
		}
	
	
		//for sum of all elements in an array
		float sum =0;
		for(int i=0 ; i<size ; i++) {
			sum = number[i]+sum;
		}
		System.out.printf("\nsum of all the elemets in an aarray is %f \n",sum);
		
		//average calculation
		float avg = sum/size;
		System.out.println("average of all the elements in array is "+avg);
	}
	
	
}
