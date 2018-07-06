package runnable;

/**
 * Created by User on 16.06.2018.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        Clock1 clock1 = new Clock1();
        Thread clockThread1 = new Thread(clock1);
        clockThread1.start();

        Thread.sleep(10000);
        clock1.cancel();
    }

    public static class Clock implements Runnable
    {
        public void run()
        {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted())
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }

    public static class Clock1 implements Runnable
    {
        private volatile boolean isCancel = false;

        public void cancel()
        {
            this.isCancel = true;
        }

        public void run()
        {
            while (!this.isCancel)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }
}
