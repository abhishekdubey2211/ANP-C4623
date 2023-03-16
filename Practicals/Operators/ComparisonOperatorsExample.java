package corejava;
import java.util.Scanner;

public class ComparisonOperatorsExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num1 = input.nextInt();

    System.out.print("Enter another number: ");
    int num2 = input.nextInt();

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    // Comparison operators example
    if (num1 == num2) {
      System.out.println(num1 + " is equal to " + num2);
    } else if (num1 > num2) {
      System.out.println(num1 + " is greater than " + num2);
    } else {
      System.out.println(num1 + " is less than " + num2);
    }
  }
}