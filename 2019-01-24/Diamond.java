public class Diamond{
    public static void main(String[] args){
        printSpace(5);
        printX();
        System.out.println("");
        for (int i = 0; i < 9; i++){
            printSpace(Math.abs(4 - i));
            printX();                         
            printSpace(9 - Math.abs(-8 + 2 * i));
            printX();
            System.out.println("");
        }
        printSpace(5);
        printX();
    }
    
    public static void printSpace(int space){
        for (int i = 0; i < space; i++){
            System.out.print(" ");
        }
    }
    
    public static void printX(){
        System.out.print("x");
    }
}