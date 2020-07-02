package State;

public class PausedState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("In paused state");
        c.setState(this);
    }

    public String toString(){
        return "Paused State";
    }
}
