import java.util.Scanner;

/**
 * Input validation for real.
 */

public class Example2
{
    public static void main() {
        // ask for an integer
        Scanner in = new Scanner(System.in);
        System.out.print("Give me an integer. ");
        int n = 1;
        
        // while next line isn't an integer
        while(!in.hasNextInt())
        {
            // clear line, reprompt
            in.nextLine();
            System.out.print("I said give me an integer. ");
            n++; // same as n += 1, same as n = n + 1
        }
        
        // the user finally complies
        System.out.println("Thanks, that only took you " + n + " times.");
    }
}