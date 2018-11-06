import java.util.Arrays;

/**
 * Copying arrays
 */
public class Example1
{
    
    // exhibits incorrect and correct ways of copying
    public static void main() {
        
        int[] array = new int[] {2, 3, 5, 7};
        
        int[] copy1 = copyArray1(array); // copy1 = array
        int[] copy2 = copyArray2(array); // copy2[i] = array[i]
        int[] copy3 = copyArray3(array); // copy3 = Arrays.copyOf(array)
        
        System.out.println("At first:");
        System.out.println("original: " + Arrays.toString(array));
        System.out.println("copy 1: " + Arrays.toString(copy1));
        System.out.println("copy 2: " + Arrays.toString(copy2));
        System.out.println("copy 3: " + Arrays.toString(copy3) + "\n");
        
        array[0] = 1;
        // array = reverse(array);
        // array = shift(array, 3);
        
        System.out.println("After editing original array:");        
        System.out.println("original: " + Arrays.toString(array));
        System.out.println("copy 1: " + Arrays.toString(copy1));
        System.out.println("copy 2: " + Arrays.toString(copy2));
        System.out.println("copy 3: " + Arrays.toString(copy3) + "\n");  
    }
    
    // copies array via copy = array
    public static int[] copyArray1 (int[] array) {
        int[] copy = array;
        return copy;
    }
    
    // copies array via copy[i] = array[i]
    public static int[] copyArray2 (int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    
    // copies array via Arrays package method copyOf
    public static int[] copyArray3 (int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        return copy;
    }
    
    // reverses an array--use a loop!
    public static int[] reverse (int[] array) {
        return null;
    }
    
    // shifts an array to the right n spaces--use a loop and modulo operator!
    public static int[] shift(int[] array, int n) {
        return null;
    }
    
    
    
}
