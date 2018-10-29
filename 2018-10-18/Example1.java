/**
 * Happy New Year!
 */

public class Example1
{
    public static void main() throws Exception {
        // initialize countdown
        int countdown = 10;
        
        // count down to 1
        while (countdown > 0) {
            System.out.println(countdown);
            // wait 1 second (1000 milliseconds)
            Thread.sleep(1000);
            countdown++;
        }
        
        // happy new year!
        System.out.println("Happy New Year!");
    }
}
