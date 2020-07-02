package Bridge;

public class Assembled implements Workshop {
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
