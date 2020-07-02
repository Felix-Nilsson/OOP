package FactoryMethod;

public class FactoryTwo implements IFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductTwo();
    }
}
