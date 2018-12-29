package task20.task2025;

import java.util.Arrays;
import java.util.LinkedList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i < N; i++) {
            int degree = getDegree(i);

            int input = i;
            int sum = 0;
            int k;

            sum = getSum(degree, input);

            /*do {
                k = input % 10;
                int a = 1;
                for(int j = 0; j < degree; j++) {
                    a *= k;
                }
                sum += a;
            } while ( (input /= 10) > 0);*/

            if (sum == i) {
                list.add(i);
            }
        }
        result = new long[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
    public static int getDegree(int i)
    {
        int degree = 0;

        do {
            degree += 1;
        } while ( (i /= 10) > 0);
        return degree;
    }
    public static int getSum(int degree, int input)
    {
        int sum = 0;
        int k;
        do {
            k = input % 10;
            int a = 1;
            for(int j = 0; j < degree; j++) {
                a *= k;
            }
            sum += a;
        } while ( (input /= 10) > 0);

        return sum;
    }
    public static void main(String[] args)
    {
        Long t0 = System.currentTimeMillis();
        int number = 8000;
        long[] a = getNumbers(number);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
