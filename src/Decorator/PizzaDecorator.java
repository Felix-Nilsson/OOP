package Decorator;

public class PizzaDecorator implements Pizza {
    Pizza p;

    public PizzaDecorator(Pizza p){
        this.p = p;
    }

    @Override
    public void eat() {
        System.out.println("Eat from PizzaDecorator");
    }

    @Override
    public String getDescription() {
        return p.getDescription();
    }
}
