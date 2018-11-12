import java.util.Scanner;
/**
 * This includes the basic functionality of Nim as described in Step 2.
 * 
 * Note while we have discussed static variables, this avoids using them.
 * I've also advocated for the use of no more than one Scanner object in a program.
 * 
 * So, as a result, the Scanner object in is declared in the main method but has to be
 * a parameter for the getSticks method, which is the only method that actually uses
 * the Scanner.
 * 
 * This may feel weird. But the Step 4 suggests implementing functionality that
 * requires more user input. So we may as well put the Scanner in the main method.
 */
public class Basic
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
            sticks -= getSticks(player, in); // get sticks to remove and subtract
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
    
    // get number of sticks to remove
    public static int getSticks(int player, Scanner in) {
        System.out.print("Player " + player + " remove how many sticks? ");
        return in.nextInt();
    }
}
