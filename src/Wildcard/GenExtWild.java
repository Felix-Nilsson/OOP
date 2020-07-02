package Wildcard;

import java.util.*;

public class GenExtWild<T extends Number & Comparable<? extends T>> {
    public static void main(String[] args) {
        Map<String, List<?>> m = new HashMap<>();

        m.put("first",new ArrayList<Integer>());
        m.put("Second", new ArrayList<String>());

        System.out.println(getLists(m));
    }

    public int compareNumbers(T t1, T t2){
        //return t1.compareTo(t2);      Does not compile, Why?
        return 0;
    }

    public static Collection<List<?>> getLists(Map<String,List<?>> m){
        return m.values();

    }


}
