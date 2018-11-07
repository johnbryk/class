
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
        for (String name : names) { // for (int i = 0; i < names.length; i++) {
            sayHello(name); // String name = names[i]; sayHello(name);
        }
        
        System.out.println("");
    }
    
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

}
