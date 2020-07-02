package GenericsAndWildcards;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList();
        List<Integer> integers = new ArrayList();

        Lista.enumerate(doubles); //Shows Covariance
        Lista.enumerate(integers);

        List<Number> n = new ArrayList<>(); //Shows Contravariance
        Lista.addOne(n);
    }
}
