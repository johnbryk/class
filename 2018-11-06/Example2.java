import java.util.Arrays;
import java.util.Random;

/**
 * Random arrays and array traversal
 */
public class Example2
{
    // generates some random grades and finds ranges and average
    public static void main() {
        int[] array = randomArray(10, 70, 101);
        
        System.out.println("Grades: " + Arrays.toString(array));
        System.out.println("A's: " + inRange(array, 90, 101));
        System.out.println("B's: " + inRange(array, 80, 90));
        System.out.println("C's: " + inRange(array, 70, 80));
        System.out.println("Average: " + average(array) + "\n");
        
    }
    
    // random integer array with given length and values in [min, max)
    public static int[] randomArray(int length, int min, int max) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }
    
    // count how many values in [min, max)
    public static int inRange(int[] array, int min, int max) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (min <= array[i] && array[i] < max) {
                count++;
            }
        }
        return count;
    }
    
    // give sum of values in array
    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
    
    // give average of values in array
    public static double average(int[] array) {
        return 1.0 * sum(array) / array.length;
    }
}








