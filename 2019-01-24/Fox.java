public class Fox {
    public static void main (String[] args) {
        printTrapozoid(5);
        daoPyramid(14);
    }
    
     public static void daoPyramid (int n) {
        for (int i = 8; i >= 0 ; i--){
            for (int k = 8-i; k > 0 ; k--){
                System.out.print (" ");
            }
            
            for (int j = 0; j< (2*i + 1); j++){
                System.out.print ("x");
            }
            System.out.print("\n");
        }
    }
    
    public static void printTrapozoid (int n) {
        for (int i = n/2; i < n ; i++){
            for (int k = n-i - 1; k > 0 ; k--){
                System.out.print (" ");
            }
            
            for (int j = 1; j< (/*2**/i + 1); j++){
                System.out.print ("xx");
            }
            
            for (int k = n-i; k > 0 ; k--){
                System.out.print ("  ");
            }
            
            for (int j = 1; j< (/*2**/i + 1); j++){
                System.out.print ("xx");
            }
            System.out.print("\n");
        }
    }
}