package Array;
import java.util.Scanner;

public class StringCompare 
{

    public static void main(String[] args) 
    {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        //  enter the first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        //  enter the second string
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Compare the two strings using the equals() 
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal");
        }
         else 
         {
            int result = str1.compareTo(str2);

            // If the first string comes before the second string alphabetically
            if (result < 0)
            {
                System.out.println(str1 + " comes before " + str2 + " alphabetically");
            }
            // If the second string comes before the first string alphabetically
            else
            {
                System.out.println(str2 + " comes before " + str1 + " alphabetically");
            }
        }
    }
}
