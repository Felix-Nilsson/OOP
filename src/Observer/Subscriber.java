package Observer;

public class Subscriber implements IObserver {
    private Newspaper newspaper;

    @Override
    public void update() {
        System.out.println("Today i read:\n" + newspaper.publish());
    }

    public void register(Newspaper newspaper){
        this.newspaper = newspaper;
    }
}
