package FactoryMethod;

public class FactoryOne implements IFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductOne();
    }
}
