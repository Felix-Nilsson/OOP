package Iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    ConcreteIterable i;
    int pos;

    public ConcreteIterator(ConcreteIterable i){
        this.i = i;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        if(pos >= i.stringList.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object Next() {
        String s = i.stringList.get(pos);
        pos++;
        return s;
    }
}
