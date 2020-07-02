package TemplateMethod;

public class ConcretePosterTwo extends AbstractPoster {
    @Override
    public void operationOne() {
        System.out.println("Fish soup");
    }

    @Override
    public void operationTwo() {
        System.out.println("For 109kr");
    }
}
