package task15.task1501;

/**
 * Created by User on 10.09.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Object getAllowedAction(String name) {
            return "";
        }

        @Override
        public Object getAllowedAction() {
            return (Object)"wqewqeqwe";
        }
    }
}