package Kompostion;

import java.awt.*;

public class Rectangle implements IPolygon{
    private Polygon parent = new Polygon();


    public void paint(Graphics g) {
        parent.paint(g);
    }


    public boolean overlaps(Polygon p) {
        return parent.overlaps(p);
    }


    public void printBigger(int a, int b) {
        parent.printBigger(a,b);
    }
}
