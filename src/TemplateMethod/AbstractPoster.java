package TemplateMethod;

public abstract class AbstractPoster {
    public final void templateMethod(){
        System.out.println("-----Today's special-----");
        operationOne();
        operationTwo();
        System.out.println("-----TheKitchenPlace-----");
    }

    public abstract void operationOne();


    public abstract void operationTwo();
}
