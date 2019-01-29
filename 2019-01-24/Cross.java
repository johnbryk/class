public class Cross
{
    public static void printCross(int height){
        if (height%2==0){
            for (int i = 0; i < height+1; i++) {
                if(i!= (height/2)){
                    for (int j = 0; j < height+1; j++){
                        if (j!= (height/2)){
                            System.out.print("x");
                        }
                        else {
                            System.out.print("    ");
                        }
                    }
                    System.out.println("");
                }
                else{
                    System.out.println("");
                }
            }
        }else{
            for (int i = 0; i < height; i++) {
                if(i!= ((height-1)/2)){
                    for (int j = 0; j < height; j++){
                        if (j!= ((height-1)/2)){
                            System.out.print("x");
                        }
                        else {
                            System.out.print("    ");
                        }
                    }
                    System.out.println("");
                }
                else{
                    System.out.println("");
                }
            }
        }
    }
}
