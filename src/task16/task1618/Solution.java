package task16.task1618;

/**
 * Created by User on 05.11.2017.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public void run(){

        }
    }
}
