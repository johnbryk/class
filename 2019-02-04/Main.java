
public class Main
{
    public static void main(String[] args) {
        Rep jahana = new Rep("Jahana",
                             "Hayes",
                             2019,
                             "CT",
                             5,
                             "D",
                             "F");
        System.out.println(jahana.toString() + " has served for "
                           + jahana.yearsServed() + " years.");
    }
}
