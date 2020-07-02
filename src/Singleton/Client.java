package Singleton;

public class Client {
    public static void main(String[] args) {
        //Singleton s = new Singleton();    Wont work since constructor is private
        Singleton p = Singleton.getInstance();
        Singleton q = Singleton.getInstance();

        if(q.equals(p)){
            System.out.println("same object");
        }

    }
}
