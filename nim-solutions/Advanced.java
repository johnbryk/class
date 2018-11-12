import java.util.Scanner;
/**
 * This includes all advanced functionality of Nim as described in Step 4.
 */
public class Advanced
{
    // runs the game
    public static void main(String[] args) {
        
        // set the game up
        Scanner in = new Scanner(System.in);
        int sticks = getStartingSticks(in); // initial number of sticks
        int removeMax = getRemoveMax(in); // maximum number of sticks to remove
        int players = getPlayers(in); // number of players
        int player = 0; // keeps track of whose turn it is; starts at 0 because now we
                        // say who loses (see below)
        
        // play the game: while sticks are left, get user input and remove sticks
        while(sticks > 0) {
            /*
             * Increases player by 1 unless the player = players, in which case it's now
             * player 1's turn. We do this first now because we report the player who loses
             * (which is easier for > 2 players, since one player loses and the rest win).
             * So now when this while loop quits, player = the player who played last.
             */ 
            player = player % players + 1;
            printSticks(sticks); // print sticks
            // get sticks to remove and subtract--note now incorporates removeMax
            sticks -= getSticks(player, sticks, removeMax, in);
        }
        
        // Report who loses.
        System.out.println("Player " + player + " loses!"); 
    }
    
    // prints an arbitrary number of sticks
    public static void printSticks(int sticks) {
        for (int i = 0; i < sticks; i++) {
            System.out.print("|"); // use print and not println here so it's all one line
        }
        System.out.println(""); // new line OUTSIDE the for loop
    }
    
    // gets number of sticks to remove; removeMax is now a parameter
    public static int getSticks(int player, int sticks, int removeMax, Scanner in) {
        while (true) {
            System.out.print("Player " + player + " remove how many sticks? ");
            // check if input is an integer
            if (in.hasNextInt()) {
                int toRemove = in.nextInt(); // get number of sticks to remove
                // check if integer positive and at most removeMax (and at most number of
                // sticks left)
                if (toRemove >= 1 && toRemove <= removeMax && toRemove <= sticks) {
                    return toRemove; // if we're good, return the number
                }
            }
            in.nextLine(); // clear the input if it isn't valid
        }
    }
    
    // gets starting sticks
    public static int getStartingSticks(Scanner in) {
        while (true) {
            System.out.print("Start with how many sticks? ");
            // check if input is an integer
            if (in.hasNextInt()) {
                int sticks = in.nextInt(); // get number of sticks to start with
                // check if integer is positive
                if (sticks > 0) {
                    return sticks; // if we're good, return the number
                }
            }
            in.nextLine(); // clear the input if it isn't valid
        }
    }
    
    // gets maximum number of sticks to remove
    public static int getRemoveMax(Scanner in) {
        while (true) {
            System.out.print("Maximum number of sticks to remove? ");
            // check if input is an integer
            if (in.hasNextInt()) {
                int sticks = in.nextInt(); // get number of sticks to start with
                // check if integer is positive
                if (sticks > 0) {
                    return sticks; // if we're good, return the number
                }
            }
            in.nextLine(); // clear the input if it isn't valid
        }
    }
    
    // gets number of players
    public static int getPlayers(Scanner in) {
        while (true) {
            System.out.print("How many players? ");
            // check if input is an integer
            if (in.hasNextInt()) {
                int players = in.nextInt(); // get number of players
                // check if integer more than one player
                if (players > 1) {
                    return players; // if we're good, return the number
                }
            }
            in.nextLine(); // clear the input if it isn't valid
        }
    }
}
