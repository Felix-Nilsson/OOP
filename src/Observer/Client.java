package Observer;

public class Client {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        Subscriber subscriber = new Subscriber();

        newspaper.register(subscriber);
        subscriber.register(newspaper);

        newspaper.write();
        newspaper.write();
        newspaper.notifyObservers();
    }
}
