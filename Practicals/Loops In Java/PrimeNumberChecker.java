package corejava;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        do 
        {
            System.out.print("Enter a positive integer greater than 1: ");
            number = scanner.nextInt();
        } while (number <= 1); // continue asking until the input is a positive integer greater than 1

        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime) 
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
