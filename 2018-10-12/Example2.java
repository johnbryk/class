import java.util.Scanner;
/**
 * Chaining conditionals.
 * Using || instead of chaining commented out below.
 */
public class Example2
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("x-coordinate: ");
        double x = in.nextDouble();
        
        System.out.print("y-coordinate: ");
        double y = in.nextDouble();
        
        if (y == 0)
        {
            System.out.println("(" + x + "," + y + ") is on an axis.");
        }
        else if (x == 0)
        {
            System.out.println("(" + x + "," + y + ") is on an axis.");
        }
        else
        {
            System.out.println("(" + x + "," + y + ") is not on an axis.");
        }
        
        // if (y == 0 || x == 0)
        // {
            // System.out.println("(" + x + "," + y + ") is on an axis.");
        // }
        // else
        // {
            // System.out.println("(" + x + "," + y + ") is not on an axis.");
        // }
        
    }
}
