package Iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteIterable concreteIterable = new ConcreteIterable();
        concreteIterable.stringList.add("one");
        concreteIterable.stringList.add("two");
        concreteIterable.stringList.add("three");

        Iterator concreteIterator = concreteIterable.createIterator();

        while(concreteIterator.hasNext()){
            System.out.println(concreteIterator.Next());
        }

    }
}
