package Thread;

public class Count extends Thread {

    String s;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(s + ": " + i);
           /*
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            */
        }
    }
}
