package task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task17" + screening + "task1721" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(dir + reader.readLine());
        int min = Integer.MAX_VALUE;
        int count = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if(min > data)
                min = data;
        }
        System.out.println(min);
        inputStream.close();
    }
}
