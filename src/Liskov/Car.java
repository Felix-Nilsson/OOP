package Liskov;

public class Car {
    private int gears;
    private int currentGear = 0;

    public Car(int gears){
        this.gears = gears;
    }

    public void shiftUp(){
        currentGear++;

        if(currentGear>gears){
            currentGear = gears;
            System.out.println("Top gear reached: " + currentGear);
        }
        else{
            System.out.println("Gear: " + currentGear);
        }

    }

    public void shiftDown(){
        currentGear--;

        if(currentGear<1){
            currentGear = 1;
            System.out.println("Lowest gear reached: " + currentGear);
        }
        else{
            System.out.println("Gear: " + currentGear);
        }

    }

}
