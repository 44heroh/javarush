package task12.task1209;

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

        System.out.println(min(aInt,bInt));
        System.out.println(min(aLong,bLong));
        System.out.println(min(aDouble,bDouble));
    }

    public static int min(int a, int b){
        return Math.min(a,b);
    }

    public static long min(long a, long b){
        return Math.min(a,b);
    }

    public static double min(double a, double b){
        return Math.min(a,b);
    }
}
