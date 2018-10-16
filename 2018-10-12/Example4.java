import java.util.Scanner;
/**
 * Validating input.
 * Using return to skip code.
 */
public class Example4
{
    public static void main() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Give me an integer: ");
        
        if (!in.hasNextInt()) {
            System.out.println("THAT'S NOT AN INTEGER.");
            return;
        }
        
        int n = in.nextInt();
        
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        System.out.println("I love the integer " + n + "!");
        
    }
}
