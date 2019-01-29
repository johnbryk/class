import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.geom.Line2D;

public class Drawing extends Canvas {
    
    public List<Polygon> shapes;
    public JFrame frame;
    public Graphics2D g2;
    
    public Drawing() {
        JFrame frame = new JFrame("");
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        shapes = new ArrayList<Polygon>();
    }
    
    public void addShape(Polygon shape) {
        shapes.add(shape);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (Polygon shape : shapes) {
            draw(shape, g2);
        }
        this.g2 = g2;
    }
    
    public static void draw(Polygon p, Graphics2D g2) {
        for (Line2D side : p.sides) {
            g2.draw(side);
        }
    }
}