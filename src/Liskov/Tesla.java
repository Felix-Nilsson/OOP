package Liskov;

public class Tesla extends Car{

    public Tesla() {
        super(0);
    }

    @Override
    public void shiftUp(){
        System.out.println("Does nothing");
    }

    @Override
    public void shiftDown(){
        System.out.println("Does nothing");
    }
}
