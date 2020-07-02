package Decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza p) {
        super(p);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "...With Cheese";
    }

}
