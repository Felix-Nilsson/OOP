package Composite;

public class Client {
    public static void main(String[] args) {
        Composite c1 = new Composite();
        Composite c2 = new Composite();
        Composite c3 = new Composite();

        c1.add(c2);
        c1.add(c3);

        for(int i = 0; i < 3; i++){
            c3.add(new Leaf());
            c2.add(new Leaf());
        }

        c1.print();

    }

}
