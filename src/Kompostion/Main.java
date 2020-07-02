package Kompostion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printBigger(1,2);

        List<IPolygon> list = new ArrayList();
        list.add(new Polygon());
        list.add(new Rectangle()); //fråga om detta

        for(IPolygon ip : list){
            ip.printBigger(5,4);
        }

    }
}
