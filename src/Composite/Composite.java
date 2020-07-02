package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent{
    private List<IComponent> children = new ArrayList();


    @Override
    public void print() {
        System.out.println("Composite");

        for(IComponent ic : children){
            ic.print();
        }

    }

    public void add(IComponent ic){
        children.add(ic);
    }
}
