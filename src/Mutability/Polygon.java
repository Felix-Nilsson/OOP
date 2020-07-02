package Mutability;

import java.util.ArrayList;

public class Polygon {
    private final Point center;
    private final ArrayList<Point> border;

    public Polygon(Point center, ArrayList<Point> border){
        this.center = center;
        this.border = border;
    }

    public Point getCenter() {
        return center;
    }

    public ArrayList<Point> getBorder() {
        return border;
    }
}
