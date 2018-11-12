import java.util.Scanner;
/**
 * This includes the basic functionality of Nim as described in Step 2 and is basically the
 * same as Basic. However, I put the main game loop into its own method gameLoop. This
 * just feels good to me, as things are more encapsulated.
 */
public class BasicAlt
{

    public static void main(String[] args) {
        // set up
        Scanner in = new Scanner(System.in);
        int sticks = 10;
        int player = 1;
        
        // run the game
        int winner = gameLoop(sticks, player, in);
        
        // report winner
        System.out.println("Player " + winner + " wins!");
    }
    
    public static int gameLoop(int sticks, int player, Scanner in) {
        while(sticks > 0) {
            printSticks(sticks);
            sticks -= removeSticks(player, in);
            player = player % 2 + 1;
        }
        return player;
    }
    
    public static void printSticks(int sticks) {
        for (int i = 0; i < sticks; i++) {
            System.out.print("|");
        }
        System.out.println("");
    }
    
    public static int removeSticks(int player, Scanner in) {
        System.out.print("Player " + player + " remove how many sticks? ");
        return in.nextInt();
    }
    
}
