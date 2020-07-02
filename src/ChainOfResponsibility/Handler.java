package ChainOfResponsibility;

public interface Handler {
    public void setNext(Handler handler);
    public void func(Number n);
}
