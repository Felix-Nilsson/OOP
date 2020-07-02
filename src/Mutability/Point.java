package Mutability;

public class Point implements IPoint {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return x + ", " + y;
    }

    @Override
    public int returnX() {
        return x;
    }

    @Override
    public int returnY() {
        return y;
    }
}
