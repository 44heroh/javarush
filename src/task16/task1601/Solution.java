package task16.task1601;

/**
 * Created by User on 20.09.2017.
 */
public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        public void run(){
            System.out.println("My first thread");
        }
    }
}
