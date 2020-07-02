package Types;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<InterfaceOne> listOne = new ArrayList();
        listOne.add(new A());

        List<InterfaceTwo> listTwo = new ArrayList();
        listTwo.add(new A());


    }
}
