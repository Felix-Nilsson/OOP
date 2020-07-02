package Kompostion;

import java.awt.*;

public class Polygon implements IPolygon {

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public boolean overlaps(Polygon p) {
        return false;
    }

    @Override
    public void printBigger(int a, int b) {
        if (a>b) System.out.println(a);
        else System.out.println(b);
    }
}
