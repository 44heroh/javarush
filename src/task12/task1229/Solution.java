package task12.task1229;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Worker implements Businessman {
        public void workHard(){}
    }

    public static class CTO extends Worker implements Businessman {

    }
}
