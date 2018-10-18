
/**
 * Nested loops
 */
public class Example5
{
    
    // What does this do?
    public static void main() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
    // How can we use this to make the above look cleaner?
    public static void printRow(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    
    
    

}
