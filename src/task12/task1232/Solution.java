package task12.task1232;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Pegas horse = new Pegas();
    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        public void fly(){

        }
    }
}
