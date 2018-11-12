import java.util.Scanner;
/**
 * This includes all advanced functionality of Nim as described in Step 4.
 * I notice that we do a lot of the same input validation in a lot of the methods,
 * so I consolidate them into one method.
 */
public class AdvancedAlt
{
    // runs the game
    public static void main(String[] args) {
        
        // set the game up
        Scanner in = new Scanner(System.in);
        int sticks = getNumber("Start with how many sticks? ", in, 1, -1);
        int removeMax = getNumber("Maximum number of sticks to remove? ", in, 1, -1);
        int players = getNumber("How many players? ", in, 2, -1);
        int player = 0;
        
        // play the game: while sticks are left, get user input and remove sticks
        while(sticks > 0) {
            player = player % players + 1; // next player
            printSticks(sticks); // print sticks
            sticks -= getNumber("Player " + player + " remove how many sticks? ", in, 1,
                                Math.min(sticks, removeMax));
        }
        
        // Report who loses.
        System.out.println("Player " + player + " loses!"); 
    }
    
    // prints an arbitrary number of sticks
    public static void printSticks(int sticks) {
        for (int i = 0; i < sticks; i++) {
            System.out.print("|");
        }
        System.out.println("");
    }
    
    // prompts user for a number in given range; if max = -1, ignore max
    public static int getNumber(String prompt, Scanner in, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                int number = in.nextInt();
                if (number >= min && (number <= max || max == -1)) {
                    return number;
                }
            }
            in.nextLine();
        }
    }
}
