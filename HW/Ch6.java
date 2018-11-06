
/**
 */
public class Ch6
{
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }
    
    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackerman(m - 1, 1);
        } else {
            return ackerman(m - 1, ackerman(m, n - 1));
        }
    }
    
    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return power(x, n + 1) / x;
        }
    }
            
}
