import java.util.Scanner;
/**
 * This includes the intermediate functionality of Nim as described in Step 3, namely
 * input validation.
 */
public class Intermediate
{
    // runs the game
    public static void main(String[] args) {
        
        // set the game up
        Scanner in = new Scanner(System.in);
        int sticks = 10; // initial number of sticks
        int player = 1; // keeps track of whose turn it is
        
        // play the game: while sticks are left, get user input and remove sticks
        while(sticks > 0) {
            printSticks(sticks); // print sticks
            sticks -= getSticks(player, sticks, in); // get sticks to remove and subtract
            player = player % 2 + 1; // this switches from 1 to 2 or from 2 to 1
        }
        
        // think through the logic to make sure the correct player wins
        System.out.println("Player " + player + " wins!"); 
    }
    
    // prints an arbitrary number of sticks
    public static void printSticks(int sticks) {
        for (int i = 0; i < sticks; i++) {
            System.out.print("|"); // use print and not println here so it's all one line
        }
        System.out.println(""); // new line OUTSIDE the for loop
    }
    
    /*
     * Gets number of sticks to remove. Note that the number of sticks we remove should
     * be equal to 1 or 2 AND at most equal to the number of sticks left. So if there's
     * one stick left, you can't remove 2. So sticks is now a parameter.
     */
    public static int getSticks(int player, int sticks, Scanner in) {
        while (true) {
            System.out.print("Player " + player + " remove how many sticks? ");
            // check if input is an integer
            if (in.hasNextInt()) {
                int toRemove = in.nextInt(); // get number of sticks to remove
                // check if integer is 1 or 2 (and at most number of sticks left)
                if (toRemove >= 1 && toRemove <= 2 && toRemove <= sticks) {
                    return toRemove; // if we're good, return the number
                }
            }
            in.nextLine(); // clear the input if it isn't valid
        }
    }
}
