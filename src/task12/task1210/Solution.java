package task12.task1210;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        int aInt = 2;
        int bInt = 3;
        long aLong = 2;
        long bLong = 3;
        double aDouble = 2.0;
        double bDouble = 3.0;

        System.out.println(max(aInt,bInt));
        System.out.println(max(aLong,bLong));
        System.out.println(max(aDouble,bDouble));
    }

    public static int max(int a, int b){
        return Math.max(a,b);
    }

    public static long max(long a, long b){
        return Math.max(a,b);
    }

    public static double max(double a, double b){
        return Math.max(a,b);
    }
}
