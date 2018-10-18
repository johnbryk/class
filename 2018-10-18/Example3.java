import java.util.Scanner;

/**
 * Adding up numbers with break.
 */
public class Example3
{
    public static void main() {
        Scanner in = new Scanner(System.in);
        
        // initialize sum to 0
        int sum = 0;
        
        // ask for integers until the user enters something else, adding
        // integers to the sum
        while (true) {
            System.out.print("Give me an integer or enter" +
                               " anything else to quit: ");
            if (!in.hasNextInt()) {
                break;
            }
            sum += in.nextInt();
        }
        
        // report the sum
        System.out.println("The sum is " + sum + ".");
    }
}
