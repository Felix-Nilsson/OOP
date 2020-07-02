package Bridge;

public class Bike extends Vehicle {
    public Bike (Workshop w1, Workshop w2){
        super(w1,w2);
    }

    @Override
    public void manufacture() {
        w1.work();
        w2.work();
        System.out.println("Bike");
    }
}
