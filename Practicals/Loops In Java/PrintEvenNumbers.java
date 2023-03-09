package corejava;
import java.util.Scanner;

public class PrintEvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int i = 2; 

       
        while (i <= n) 
        {
            System.out.print(i + " ");
            i += 2; 
           n = sc.nextInt();
        }

        
    }
}
