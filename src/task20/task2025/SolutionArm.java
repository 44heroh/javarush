package task20.task2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionArm {
    private static int N;
    private static int[] digitsMultiSet;
    private static int[] testMultiSet;

    private static List<Long> results;
    private static long maxPow;
    private static long minPow;

    private static long[][] pows;

    private static long maxNumber;

    private static void genPows(long maxN) {
        maxNumber = maxN;
        int N = 20;
        pows = new long[10][(int) (N + 1)];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                if(p <= maxN){
                    pows[i][j] = p;
                    p *= i;
                }
            }
        }
    }

    private static boolean check(long pow) {
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;

        for (int i = 0; i < 10; i++) {
            testMultiSet[i] = 0;
        }

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            if (testMultiSet[i] > digitsMultiSet[i]) return false;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }

        return true;
    }

    private static void search(int digit, int unused, long pow) {
        if (pow >= maxPow) return;

        if (digit == -1) {
            if (check(pow)){
                if(pow <= maxNumber){
                    results.add(pow);
                }
            }
            return;
        }

        if (digit == 0) {
            digitsMultiSet[digit] = unused;
            search(digit - 1, 0, pow + unused * pows[digit][N]);
        } else {
            // Check if we can generate more than minimum
            if (pow + unused * pows[digit][N] < minPow) return;

            long p = pow;
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit - 1, unused - i, p);
                if (i != unused) {
                    p += pows[digit][N];
                    // Check maximum and break the loop - doesn't help
                    // if (p >= maxPow) break;
                }
            }
        }
    }

    public static List<Long> getNumbers(long maxN) {

        genPows(maxN);
        maxN = 20;
        results = new ArrayList<>();
        digitsMultiSet = new int[10];
        testMultiSet = new int[10];

        for (N = 1; N <= maxN; N++) {
            minPow = (long) Math.pow(10, N - 1);
            maxPow = (long) Math.pow(10, N);

            search(9, N, 0);
        }

        Collections.sort(results);

        return results;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Long> list = getNumbers(Integer.MAX_VALUE);
        long finish = System.currentTimeMillis();
        System.out.println("Time consumed: " + (finish - start) + " ms");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        System.out.println(list.size());
        System.out.println(list);
    }
}
