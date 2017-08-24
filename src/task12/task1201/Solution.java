package task12.task1201;

/**
 * Created by User on 24.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }

    }
}
