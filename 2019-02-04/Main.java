
public class Main
{
    public static void main(String[] args) {
        Representative jahana = new Representative("Jahana",
                                                   "Hayes",
                                                   2019,
                                                   "CT",
                                                   5,
                                                   "D",
                                                   "F");
        System.out.println(jahana.toString() + " has served in the House for "
                           + jahana.yearsServed() + " years.");
    }
}
