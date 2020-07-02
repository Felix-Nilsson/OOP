package StackVSHeap;

public class StackOverflow {
    public static void main(String[] args) {
        A a = new A();
        a.doIt();
    }


    public static class A {

        public void doIt() {
            A newA = new A();
            newA.doIt();
        }
    }

}

