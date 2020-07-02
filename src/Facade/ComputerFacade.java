package Facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Harddrive harddrive;
    private final Memory memory;

    public ComputerFacade(){
        cpu = new CPU();
        harddrive = new Harddrive();
        memory = new Memory();
    }

    public void start(){
        System.out.println("Starting computer...");

        cpu.halt();
        long bootAddress = 20;
        memory.load(bootAddress);
        cpu.execute(bootAddress);

        System.out.println("Computer started");
    }

}
