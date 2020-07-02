package FactoryMethod;

public class ConcreteProductOne extends Product {


    public static ConcreteProductOne createProduct(){
        return new ConcreteProductOne();
    }
}
