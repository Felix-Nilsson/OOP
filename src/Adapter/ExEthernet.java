package Adapter;

public class ExEthernet implements IEthernetCable {

    @Override
    public void transferData() {
        System.out.println("Transferring data via Ethernet");
    }

    @Override
    public void connectFirstComputer() {
        System.out.println("Connected first computer via Ethernet");
    }

    @Override
    public void connectSecondComputer() {
        System.out.println("Connected Second computer via Ethernet");
    }
}
