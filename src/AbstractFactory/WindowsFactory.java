package AbstractFactory;

public class WindowsFactory implements IFactory{

    @Override
    public Alert createAlert() {
        return new WindowsAlert();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
