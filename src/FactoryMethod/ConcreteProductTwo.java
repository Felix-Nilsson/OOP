package FactoryMethod;

public class ConcreteProductTwo extends Product {


    public static ConcreteProductOne createProduct(){
        return new ConcreteProductOne();
    }
}
