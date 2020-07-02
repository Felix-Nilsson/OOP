package State;

public class StartedState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("In Started state");
        c.setState(this);
    }

    public String toString(){
        return "Started State";
    }
}
