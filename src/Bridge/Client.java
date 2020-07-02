package Bridge;

public class Client {
    public static void main(String[] args) {
        Vehicle b = new Bike(new Produce(), new Assembled());
        Vehicle c = new Car(new Produce(), new Assembled());

        b.manufacture();
        c.manufacture();


    }
}
