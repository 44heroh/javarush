package task13.task1309;

/**
 * Created by User on 28.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Movable{
        Double speed();
    }

    public interface Flyable extends Movable{
        Double speed(Flyable fly);
    }
}
