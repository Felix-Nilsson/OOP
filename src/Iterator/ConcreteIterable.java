package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterable  implements Iterable{

    List<String> stringList = new ArrayList();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }


}
