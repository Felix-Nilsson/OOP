package Decorator;

public class Client {
    public static void main(String[] args) {
        Pizza assembledPizza = new PeperoniDecorator(new CheeseDecorator(new BasePizza()));

        System.out.println(assembledPizza.getDescription());

        assembledPizza.eat();
    }
}
