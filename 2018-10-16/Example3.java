
/**
 * We use methods to decompose complex code into smaller bites and chunks and to make
 * code more readable.
 */
public class Example3
{

    // Without using methods.
    public static double circleArea1(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        double radius = Math.sqrt(dx * dx + dy * dy);
        double area = Math.PI * radius * radius;
        return area;
    }
    
    // With using methods.
    public static double circleArea2(double x1, double y1, double x2, double y2) {
        double radius = distance(x1, y1, x2, y2);
        return computeArea(radius);
    }
    
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }
    
}
