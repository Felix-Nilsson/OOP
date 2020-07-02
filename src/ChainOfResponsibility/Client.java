package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handlerNeg = new NegativeHandler();
        Handler handlerPos = new PositiveHandler();
        Handler handlerZer = new ZeroHandler();
        Handler handlerUnk = new UnknownHandler();

        handlerNeg.setNext(handlerPos);
        handlerPos.setNext(handlerZer);
        handlerZer.setNext(handlerUnk);

        handlerNeg.func(new Number(0));
    }
}
