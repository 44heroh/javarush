package Tokinizer;

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String s = "Good news everyone!";
        Boolean test = s.matches("news\\.*");
        System.out.println(test);

        String sIn = "Good news everyone!";
        String s2Out = sIn.replaceAll("e","EX");
        System.out.println(s2Out);

        String sIn1 = "Good news everyone!";
        String s2Out1 = s.replaceFirst("e","EX");
        System.out.println(s2Out1);

        String sToken = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(sToken,"ne");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
