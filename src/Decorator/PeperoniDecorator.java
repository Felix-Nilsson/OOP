package Decorator;

public class PeperoniDecorator extends PizzaDecorator {
    public PeperoniDecorator(Pizza p) {
        super(p);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "...With Peperoni";
    }
}
