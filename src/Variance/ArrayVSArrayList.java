
package Variance;

import java.util.ArrayList;

public class ArrayVSArrayList {
    public static void main(String[] args) {
        String[] names = {"Anna", "Berit", "Cynthia"};
        printElementsFromArray(names);
        //printElementsFromList(names); does not compile

    }

    public static void printElementsFromArray(Object[] arr){
        for(Object o: arr){
            System.out.println(o);
        }
    }

    public static void printElementsFromList(ArrayList<Object> arr){
        for(Object o: arr){
            System.out.println(o);
        }
    }



}
