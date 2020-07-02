package Mutability;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Point p = new Point(5,5);
        Polygon pol = new Polygon(p, new ArrayList<Point>());
        System.out.println(pol.getCenter().toString());
        p.x = 6;
        System.out.println(pol.getCenter().toString());
        //Bad since Point is mutable and since Polygon depends on it
        //it will also get affected, could probably considered mutable


        //Solution 1: Wrapper to point that is immutable
        Point p2 = new Point(10,10);
        WrapperPoint wp = new WrapperPoint(p2);
        PolygonWrapper pol2 = new PolygonWrapper(wp, new ArrayList<WrapperPoint>());
        System.out.println(pol2.getCenter().toString());


    }
}
