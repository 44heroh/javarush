package task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task17" + screening + "task1721" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(dir + reader.readLine());
        TreeSet<Integer> map = new TreeSet<Integer>();
        while (inputStream.available() > 0){
            map.add(inputStream.read());
        }
        inputStream.close();

        for (int val : map)
            System.out.println(val);
    }
}
