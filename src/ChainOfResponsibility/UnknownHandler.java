package ChainOfResponsibility;

public class UnknownHandler implements Handler{
    Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void func(Number n) {
        System.out.println("Value is: " + n.value + " (Handled by: UnknownHandler)");

    }
}
