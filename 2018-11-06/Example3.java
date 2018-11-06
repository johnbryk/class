
/**
 * Enhanced for loop
 */
public class Example3
{
    public static void main() {
        String[] names = new String [] {"Tiara",
                                        "Mia",
                                        "Liz",
                                        "Sophie",
                                        "Freya",
                                        "Gabby",
                                        "Christine",
                                        "Amanda",
                                        "Amy",
                                        "Susan",
                                        "Roanna",
                                        "Sarah"};
        for (String name : names) {
            sayHello(name);
        }
        
        System.out.println("");
    }
    
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

}
