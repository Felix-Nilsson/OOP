package Liskov;

public class Client {
    public static void main(String[] args) {
        Car c = new Car(2); //Nothing strange
        c.shiftUp();
        c.shiftUp();
        c.shiftUp();

        Lamborghini l = new Lamborghini(6); //Same here
        l.shiftDown();
        l.shiftUp();

        /*
         *Breaks liskov since this means tesla is not a car since tesla does not have gears
         *Means Car class needs to be reworked to work with automatic cars
         */
        Tesla t = new Tesla();
        t.shiftDown();
        t.shiftUp();


    }

}
