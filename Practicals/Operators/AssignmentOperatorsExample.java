package corejava;
import java.util.Scanner;

public class AssignmentOperatorsExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num1 = input.nextInt();

    System.out.print("Enter another number: ");
    int num2 = input.nextInt();

    System.out.println("Initial value of num1: " + num1);
    System.out.println("Initial value of num2: " + num2);

    // Assignment operators example
    num1 += num2;
    num2 -= num1;

    System.out.println("Final value of num1: " + num1);
    System.out.println("Final value of num2: " + num2);
  }
}