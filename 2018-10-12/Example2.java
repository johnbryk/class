import java.util.Scanner;
/**
 * Write a description of class Example2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
    }
}
