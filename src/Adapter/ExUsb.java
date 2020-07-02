package Adapter;

public class ExUsb implements IUsb {


    @Override
    public void connectFirstComputer() {
        System.out.println("First Computer connected via USB");
    }

    @Override
    public void connectSecondComputer() {
        System.out.println("Second Computer connected via USB");
    }

    @Override
    public void transferData() {
        System.out.println("Transferring data via USB");
    }
}
