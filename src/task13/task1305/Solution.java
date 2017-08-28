package task13.task1305;

/**
 * Created by User on 28.08.2017.
 */
public class Solution {

    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobbie HOBBIE = new Hobbie();
    }

    public static class Hobbie  implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
