
public class Main
{
    public static void main(String[] args) {
        Drawing d = new Drawing();
        Polygon p = new Polygon(d, 100, 100, 100, 300, 300, 300, 300, 100);
        p.rotate(45);
    }
}
