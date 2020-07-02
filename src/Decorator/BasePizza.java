package Decorator;

public class BasePizza implements Pizza {
    @Override
    public void eat() {
        System.out.println("Eat in basepizza");
    }

    @Override
    public String getDescription() {
        return "a simple pizza";
    }
}
