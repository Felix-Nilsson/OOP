package Observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements IObservable {
    private int days = 0;

    private List<IObserver> subscribers = new ArrayList();

    @Override
    public void notifyObservers() {
        for(IObserver iObserver : subscribers){
            iObserver.update();
        }
    }

    @Override
    public void register(IObserver iObserver) {
        subscribers.add(iObserver);
    }

    @Override
    public void unregister(IObserver iObserver) {
        subscribers.remove(iObserver);
    }

    public String publish(){
        return "Generic Newspaper: Day " + days;
    }

    public void write(){
        days++;
    }
}
