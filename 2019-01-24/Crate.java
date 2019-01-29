public class Crate
{
    //Using 2 for loops, draw some sort of pattern using text
    //Look at another groups picture and reproduce it
    public Crate()
    {
        for(int x=0;x<7;x++){
               System.out.print("-");
            }
        System.out.println();
         for (int i=0; i<3;i++){
           
           for (int j=0;j<3;j++){
               System.out.print("|X");
            }
           System.out.print("|");
           System.out.println("");
        }   
        
        System.out.print("-------");

    }
    
}