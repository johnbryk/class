import java.awt.*;
import java.awt.geom.*;
import java.util.List;
import java.util.ArrayList;

public class Polygon {
    public Drawing d;
    public List<Point2D> corners;
    public List<Line2D> sides;

    public Polygon(List<Point2D> corners, Drawing d) {
        this.corners = corners;
        sides = new ArrayList<Line2D>();
        makeSides();
        this.d = d;
        d.shapes.add(this);
        d.repaint();
    }
    
    public Polygon(Drawing d, double... coords) {
        this(arrayToList(coords), d);
    }
    
    public static List<Point2D> arrayToList(double[] coords) {
        List<Point2D> corners = new ArrayList<Point2D>();
        for (int i = 0; i < coords.length / 2; i ++) {
            corners.add(new Point2D.Double(coords[2 * i], coords[2 * i + 1]));
        }
        return corners;
    }
 
    public void makeSides() {
        for (int i = 0; i < corners.size(); i++) {
            sides.add(new Line2D.Double(corners.get(i), corners.get((i + 1) % corners.size())));
        }
    }
    
    public void updateSides() {
        for (int i = 0; i < corners.size(); i++) {
            sides.get(i).setLine(corners.get(i), corners.get((i + 1) % corners.size()));
        }
    }
    
    public void move(double dx, double dy) {
        for (Point2D corner : corners) {
            corner.setLocation(corner.getX() + dx, corner.getY() + dy);
        }
        updateSides();
        d.repaint();
    }
    
    public void scale(double k) {
        for (Point2D corner : corners) {
            corner.setLocation((corner.getX() - 200) * k + 200, (corner.getY() - 200) * k + 200);
        }
        updateSides();
        d.repaint();
    }
    
    public void rotate(double t) {
        t = t * Math.PI / 180;
        for (Point2D corner : corners) {
            corner.setLocation((corner.getX() - 200) * Math.cos(t) + (corner.getY() - 200) * Math.sin(t) + 200,
                               (corner.getX() - 200) * Math.sin(-t) + (corner.getY() - 200) * Math.cos(t) + 200);
        }
        updateSides();
        d.repaint();
    }
    
}
