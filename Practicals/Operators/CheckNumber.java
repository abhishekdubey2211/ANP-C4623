package Operators;
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // Prompt the user to enter a number between 1 and 100
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        int number = sc.nextInt();

        // Check if the number is within the range of 1 to 100
        if (number >= 1 && number <= 100) {
            // Check if the number is divisible by both 2 and 3
            if (number % 2 == 0 && number % 3 == 0) {
                System.out.println(number + " is divisible by both 2 and 3.");
            }
            // Check if the number is divisible by either 2 or 3 but not both
            else if ((number % 2 == 0 || number % 3 == 0) && !(number % 2 == 0 && number % 3 == 0)) {
                System.out.println(number + " is divisible by either 2 or 3 but not both.");
            }
            // Check if the number is not divisible by either 2 or 3
            else {
                System.out.println(number + " is not divisible by either 2 or 3.");
            }
        }
        else {
            System.out.println("Number is not within the range of 1 to 100.");
        }
    }
}
