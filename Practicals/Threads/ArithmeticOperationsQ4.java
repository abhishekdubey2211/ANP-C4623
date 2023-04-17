package Threads;
import java.util.Scanner;

public class ArithmeticOperationsQ4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Read input from user
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Enter the operation (+, -, *, /): ");
            char op = sc.next().charAt(0);
            
            // Perform the requested operation
            double result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero not allowed");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
            
            // Print the result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }

}
