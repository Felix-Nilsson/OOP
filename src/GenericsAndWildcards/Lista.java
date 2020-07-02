package GenericsAndWildcards;

import java.util.List;

public class Lista  {
    public static void addOne(List<? super Integer> list){
        list.add(new Integer(1));

    }

    public static void enumerate(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }

}
