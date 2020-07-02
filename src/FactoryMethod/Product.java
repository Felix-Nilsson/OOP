package FactoryMethod;

public class Product {
    public static Product createProduct(){
        return new Product();
    }
}
