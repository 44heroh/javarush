package sleepjoin;

/**
 * Created by User on 16.06.2018.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();

        Thread.sleep(1500);

        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        thread1.join();
    }

    public static class Printer implements Runnable {
        private String name;
        public Printer(String name)
        {
            this.name = name;
        }

        public Printer() {
            this.name = "printer";
        }

        public void run()
        {
            System.out.println("I’m " + this.name);
        }
    }
}
