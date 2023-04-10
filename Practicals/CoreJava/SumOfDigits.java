package corejava;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking the input of number that need to be added of each of its digit
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        //printing the sum of each digits of entered numbers
        System.out.println("The sum of the digits is: " + sum);
    }
}
