package task16.task1632;

import javax.imageio.metadata.IIOMetadataNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadInfinitely("Thread Infinitely"));
        threads.add(new ThreadInterrupted("Thread Interrupted"));
        threads.add(new ThreadUra("Thread Ura"));
        threads.add(new ThreadMessage("Thread Message"));
        threads.add(new ThreadNumberInputs("Thread Number Inputs"));
    }

    public static void main(String[] args) {
        for(Thread th : threads){
            th.start();
        }
    }

    private static class ThreadInfinitely extends Thread {
        public ThreadInfinitely(String s) {
            super(s);
        }

        public void run(){
            while (true){

            }
        }
    }

    private static class ThreadInterrupted extends Thread {
        public ThreadInterrupted(String s) {
            super(s);
        }

        public void run(){
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    private static class ThreadUra extends Thread {
        public ThreadUra(String s) {
            super(s);
        }

        public void run(){
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ThreadMessage extends Thread implements Message{
        private boolean die;
        public ThreadMessage(String s) {
            super(s);
            this.die = false;
        }

        public void run(){
            while (die == false){

            }
        }

        @Override
        public void showWarning() {
            die = true;
        }
    }


    private static class ThreadNumberInputs extends Thread {
        public ThreadNumberInputs(String s) {
            super(s);
        }

        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String s = "";
            while (true){
                try{
                    s = reader.readLine();
                } catch (IOException e){

                }
                if(s.equals("N") == true){
                    break;
                }
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}
