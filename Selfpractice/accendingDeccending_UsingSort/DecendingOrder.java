package Array;
import java.util.*;
import java.util.Scanner;

public class DecendingOrder {
	//input output function
	public static void inputOutput(float number[],int size) {
		Scanner sc = new Scanner(System.in);
				//input
				for(int i=0 ; i<size ; i++) 
				{
					System.out.printf("%s = ",i);
					number[i]= sc.nextFloat();
				}
				
				//output
				for(int i=0 ; i<size ; i++) 
				{
					System.out.println(number[i]+" ");
				
				}
	}
	
	
	public static void bubbleSort(float number[],int size) {
		//using bubble short deccending order
		for(int i =0 ; i<size ; i++) {
			for(int j =i+1 ; j<size ; j++) {
				if(number[i]<number[j])          //just change [i]<[j]
				{
					float temp =number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		System.out.println("printing in deccending order using bubble short ");
		// print the sorted array
		for(int i = 0; i < size; i++) {
		    System.out.println(number[i] + " ,");
		}
	}
	
	
	public static void selectionSort(float number[],int size) {
		for(int i = 0; i < size-1; i++) {
		    int min_index = i;               // find the index of the minimum element in the unsorted portion of the array
		    for(int j = i+1; j < size; j++) {
		        if(number[j] > number[min_index])             //just change [i]<[j]
		        {
		            min_index = j;
		        }
		    }
		    
		    float temp = number[i];
		    number[i] = number[min_index];
		    number[min_index] = temp;
		}
		System.out.println("printing in deccending order using selection short algoritm");
		// print the sorted array
		for(int i = 0; i < size; i++) {
		    System.out.println(number[i] + " ");
		}
	}
	
	 public static void insertionSort(float[] number , int size) 
	 {
	        
	        for(int i = 1; i < size; i++) {
	            float key = number[i];
	            int j = i-1;
	            while(j >= 0 && number[j] < key)         //  > key    to   < key
	            {
	                number[j+1] = number[j];
	                j=j-i;                               // j--      to     j= j=i
	            }
	            number[j+1] = key;
	        }
	        System.out.println("printing in deccending order using insertion short ");
			// print the sorted array
			for(int i = 0; i < size; i++) {
			    System.out.println(number[i] + " ,");
			}
	    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY  = ");
		int size = sc.nextInt();

		//creation of an array
		float number[] = new float[size];
		
		
		inputOutput(number,size);
		bubbleSort(number,size);
		selectionSort(number,size);
		insertionSort(number,size);
		
	}
	
	
}
