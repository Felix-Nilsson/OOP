package State;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State s){
        state = s;
    }

    public State getState(){
        return state;
    }

}
