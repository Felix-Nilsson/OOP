package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Product> products = new ArrayList();

        //Classical definition

        List<IFactory> factories = new ArrayList();

        factories.add(new FactoryOne());
        factories.add(new FactoryTwo());

        products.add(factories.get(0).createProduct());
        //-------------------

        //Newer definition
        products.clear();
        products.add(ConcreteProductOne.createProduct());
        products.add(ConcreteProductTwo.createProduct());


    }

}
