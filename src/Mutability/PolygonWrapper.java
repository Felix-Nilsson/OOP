package Mutability;

import java.util.ArrayList;

public class PolygonWrapper {
    private final WrapperPoint center;
    private final ArrayList<WrapperPoint> border;

    public PolygonWrapper(WrapperPoint center, ArrayList<WrapperPoint> border){
        this.center = center;
        this.border = border;
    }

    public WrapperPoint getCenter() {
        return center;
    }

    public ArrayList<WrapperPoint> getBorder() {
        return border;
    }
}
