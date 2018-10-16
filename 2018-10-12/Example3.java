import java.util.Scanner;
/**
 * Write a description of class Example3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example3
{
    public static void main()
    {
        boolean flying = false;
        boolean warmBlooded = false;
        
        if (flying) {
            if (warmBlooded) {
                System.out.println("It's a peacock!");
            } else {
                System.out.println("It's a butterfly!");
            }
        } else {
            if (warmBlooded) {
                System.out.println("It's a human!");
            } else {
                System.out.println("It's a snake!");
            }            
        }
        
        // if (flying && warmBlooded)
        // {
            // System.out.println("It's a peacock!");
        // }
        // else if (flying && !warmBlooded)
        // {
            // System.out.println("It's a butterfly!");
        // }
        // else if (!flying && warmBlooded)
        // {
            // System.out.println("It's a human!");
        // }
        // else if (!flying && !warmBlooded)
        // {
            // System.out.println("It's a snake!");
        // }
    }
}
