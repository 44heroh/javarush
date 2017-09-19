package task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        if(input > 150)
            return;

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if ( n < 0) return "0";
        if (n == 0 ) return "1";

        /*int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }

        String res = "" + fact;

        return res;*/

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; ++i)
            result = result.multiply(BigInteger.valueOf(i));

        return result.toString();
    }
}
