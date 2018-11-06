
/**
 * Write a description of class Printing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Printing
{
    public static void printRow(int length, String block, boolean lineBreak) {
        for (int i = 0; i < length; i++) {
            System.out.print(block);
        }
        if (lineBreak) System.out.print("\n");
    }
    
    public static void printPyramid(int height) {
        for (int j = 0; j < height; j++) {
            printRow(height - j - 1, " ", false);
            printRow(2 * j + 1, "X", true);
        }
    }
    
    public static void printEmptyRectangle(int height, int width) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print(block(i, j, height, width));
            }
            System.out.print("\n");
        }
    }
    
    public static String block(int i, int j, int height, int width) {
        if (j == 0 || j == height - 1) {
            if (i == 0 || i == width - 1) {
                return "+";
            } else {
                return "-";
            }
        } else {
            if (i == 0 || i == width - 1) {
                return "|";
            } else {
                return " ";
            }
        }
    }
}
