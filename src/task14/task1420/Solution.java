package task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by User on 09.09.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a <= 0 || b <= 0) throw new Exception();

        int max = Math.max(a, b);
        for(int i = max; i > 0; i--){
            if(a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
