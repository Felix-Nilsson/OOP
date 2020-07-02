package TemplateMethod;

public class ConcretePosterOne extends AbstractPoster {
    @Override
    public void operationOne() {
        System.out.println("Hamburger w fries");
    }

    @Override
    public void operationTwo() {
        System.out.println("For 90kr");
    }
}
