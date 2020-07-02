package Kompostion;

import java.awt.*;

public interface IPolygon {

    public void paint(Graphics g);

    public boolean overlaps(Polygon p);

    public void printBigger(int a, int b);
}
