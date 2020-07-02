package Adapter;

public class UsbToEthernet implements IEthernetCable {
    IUsb iUsb;

    public UsbToEthernet(IUsb iUsb){
        this.iUsb = iUsb;
    }

    @Override
    public void transferData() {
        iUsb.transferData();
    }

    @Override
    public void connectFirstComputer() {
        iUsb.connectFirstComputer();
    }

    @Override
    public void connectSecondComputer() {
        iUsb.connectSecondComputer();
    }
}
