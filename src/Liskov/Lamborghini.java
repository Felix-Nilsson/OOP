package Liskov;

public class Lamborghini extends Car {

    public Lamborghini(int gears) {
        super(gears);
    }

    public void revEngine(){
        System.out.println("VROOOOM");
    }
}
