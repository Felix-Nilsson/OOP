package AbstractFactory;

public class LinuxFactory implements IFactory {
    @Override
    public Alert createAlert() {
        return new LinuxAlert();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
