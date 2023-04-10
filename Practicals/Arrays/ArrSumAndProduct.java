package Array;
import java.util.Scanner;

public class ArrSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for an input array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d integers: ", size);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sumOfEven = 0;
        int productOfOdd = 1;
        
        // Loop through the array to calculate sum of even numbers and product of odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                // If the number is even, add it to sumOfEven
                sumOfEven += num;
            } else {
                // If the number is odd, multiply it with product Of Odd
                productOfOdd *= num;
            }
        }
        
        // Print the sum of even numbers and product of odd numbers
        System.out.printf("Sum of even numbers: %d\n", sumOfEven);
        System.out.printf("Product of odd numbers: %d\n", productOfOdd);
    }
}


