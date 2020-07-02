package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<AbstractPoster> week = new ArrayList();
        week.add(new ConcretePosterOne());
        week.add(new ConcretePosterTwo());

        for(AbstractPoster e : week){
            e.templateMethod();
            System.out.println("\nOne Day Passes\n");
        }

    }
}
