package Observer;

public interface IObservable {

    public void notifyObservers();
    public void register(IObserver iObserver);
    public void unregister(IObserver iObserver);

}
