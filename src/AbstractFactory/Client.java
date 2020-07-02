package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //Want to create Windows Components? Use WindowsFactory
        WindowsFactory wf = new WindowsFactory();
        wf.createAlert();
        wf.createButton();

        //-II- Linux components? Use LinuxFactory
        LinuxFactory lf = new LinuxFactory();
        lf.createAlert();
        lf.createButton();

        //Can use Polymorphism on factories to work for all platforms
        List<IFactory> factories = new ArrayList();
        factories.add(lf);
        factories.add(wf);

        for(IFactory factory : factories){
            factory.createAlert();
            factory.createButton();
        }

        String a = new String();


    }
}
