public class Nacho
{
    public static void main() {
    int height = 7; 
    String branch = "^"; 
    int currRow = 1;
    for(int i = 0; i < height; i++){
        for (int j = 0; j < height - i; j++)System.out.print(" "); 
        for(int k = 0; k < currRow; k++) System.out.print(branch); System.out.print(" "); 
        System.out.println(); 
       currRow++; 
    }
       
    }
}