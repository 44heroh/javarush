package task12.task1227;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Fly, Run, Swim{
        public void fly(){}
        public void run(){}
        public void swim(){}
    }

    public class Penguin implements Run, Swim{
        public void run(){}
        public void swim(){}
    }

    public class Toad implements Swim{
        public void swim(){}
    }
}
