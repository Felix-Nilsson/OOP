package Adapter;

public class Client {
    public static void main(String[] args) {
        ExEthernet exEthernet = new ExEthernet();
        ExUsb exUsb = new ExUsb();
        UsbToEthernet usbToEthernet = new UsbToEthernet(exUsb);

        exEthernet.connectFirstComputer(); //Behaves like normal, nothing strange

        exUsb.connectFirstComputer(); //Same

        usbToEthernet.connectFirstComputer(); //Has type IEthernet, behaves like Usb

        IEthernetCable newEthernetCable = usbToEthernet; //can do this for example

    }


}
