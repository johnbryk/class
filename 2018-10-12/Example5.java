
/**
 * Write a description of class Example5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example5
{
    public static void main()
    {
        other(1);
    }
    
    public static void other(int n)
    {
        if (n < 100)
        {
            System.out.println(n);
            other(n + 1);
        }
    }
}
