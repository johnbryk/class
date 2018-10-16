import java.util.Scanner;
/**
 * We use methods to simplify repetitive code.
 */
public class Example2
{
    public static void main() {
        Scanner in = new Scanner(System.in);
        
        String name = getString("What's your name? ", in);
        String food = getString("What's your favorite food? ", in);
        System.out.printf("Somebody get %s some %s!", name, food);  
    }
    
    public static String getString(String prompt, Scanner in) {
        System.out.println(prompt);
        return in.nextLine();
    }
}
