package ChainOfResponsibility;

public class PositiveHandler implements Handler{
    Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void func(Number n) {
        if(n.value > 0){
            System.out.println("Value is: " + n.value + " (Handled by: PositiveHandler)");
        }
        else {
            next.func(n);
        }
    }
}
