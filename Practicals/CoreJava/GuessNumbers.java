package corejava;
import java.util.Scanner;

public class GuessNumbers 
{
    public static void main(String[] args) 
    {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Guess a number between 0 and 100:");
        //creating Scanner to make user to input their guessed value
        Scanner sc = new Scanner(System.in);
        //declaring variable as  integer
        int guess;
        
        do {
            guess = sc.nextInt();
            if (guess < randomNumber) 
            {
                System.out.println("Too low, try again:");
            } else if (guess > randomNumber) 
            {
                System.out.println("Too high, try again:");
            }
        } while (guess != randomNumber);
        //if correct number entered
        System.out.println("Congratulations, you guessed the number!");
    }
}
