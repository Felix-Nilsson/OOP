package Mutability;

public class WrapperPoint implements IPoint{
    private Point p;

    public WrapperPoint(Point p){
        this.p = p;
    }

    @Override
    public int returnX(){
        return p.x;
    }

    @Override
    public int returnY(){
        return p.y;
    }

    @Override
    public String toString(){
        return p.toString();
    }
}
