package StackVSHeap;

import java.util.*;


public class HeapOverflow {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();

        while(true){
            list.add(new A());
        }
    }


    public static class A{

    }
}
