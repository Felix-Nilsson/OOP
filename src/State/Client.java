package State;

public class Client {
    public static void main(String[] args) {
        Context c = new Context();

        StartedState startedState = new StartedState();
        startedState.doAction(c);
        c.getState().toString();

        PausedState pausedState = new PausedState();
        pausedState.doAction(c);
        c.getState().toString();
    }
}
