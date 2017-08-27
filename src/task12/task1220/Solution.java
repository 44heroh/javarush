package task12.task1220;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }
    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }
    public abstract class Human implements Run, Swim{

    }
}
