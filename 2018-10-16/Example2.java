import java.util.Scanner;
/**
 * We use methods to simplify repetitive code.
 */
public class Example2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String name = getString("What's your name? ", in);
        String food = getString("What's your favorite food? ", in);
        String from = getString("Where are you from? ", in);
        System.out.printf("Somebody get %s from %s some %s!", name, from, food);  
    }
    
    public static String getString(String prompt, Scanner in) {
        System.out.println(prompt);
        return in.nextLine();
    }
}
