package Wildcard;

import java.util.List;

public class WildcardVsGeneric<T> {
    public void g(List<T> l){
        l.add(l.get(0));
    }


    public void f(List<?> l){
        //l.add(l.get(0));      Won't compile
    }
}
