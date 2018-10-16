
/**
 * Some simple conditionals.
 * To run in the BlueJ console and see the output, type Example1.methodName(arguments).
 */
public class Example1
{
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2); // compute the area
        return area; // return the area
    }
    
    public static boolean isEven(int n) {
        return n % 2 == 0; // determine if n is even and return value
    }
    
    public static double absValue(double x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
        
        /** The above code does NOT work if we use:
         * 
         * else if (x < 0) {
         *     return -x;
         * }
         * 
         * as the compiler is not smart enough to tell that one of the two conditions must
         * be true and, thus, is scared that it won't run into a return statement!
         */
    }
    
}
