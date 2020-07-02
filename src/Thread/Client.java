package Thread;

public class Client {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();

        c1.s = "A";
        c2.s = "B";
        c1.start();
        c1.start();
    }
}
