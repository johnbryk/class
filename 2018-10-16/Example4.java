
/**
 * Recursive methods.
 */
public class Example4
{
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    // A different way...
    
    public static int otherFibonacci(int n) {
        return fibonacciAux(n)[0];
    }
    
    public static int[] fibonacciAux(int n) {
        if (n == 1) {
            return new int[] {1, 1};
        } else {
            int[] lastTwo = fibonacciAux(n - 1);
            int a = lastTwo[0];
            int b = lastTwo[1];
            return new int[] {b, a + b};
        }
    }
}
