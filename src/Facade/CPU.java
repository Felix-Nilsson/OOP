package Facade;

public class CPU {
    public void halt(){
        System.out.println("CPU halted");
    }

    public void jump(long pos){
        System.out.println("Jumped to adr: " + pos);
    }

    public void execute(long op){
        System.out.println("Executed opcode: " + op);
    }

}
