package Bridge;

import java.sql.SQLOutput;

public class Car extends Vehicle {
    public Car(Workshop w1, Workshop w2){
        super(w1,w2);
    }

    @Override
    public void manufacture() {
        w1.work();
        w2.work();
        System.out.println("Car");
    }
}
