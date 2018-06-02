package task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task17" + screening + "task1721" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(dir + reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer count = 0;
        int value = 0;
        while(inputStream.available() > 0){
            value = inputStream.read();
            count = map.get(value);
            if(count != null)
                count++;
            else
                count = 0;

            map.put(value, count);
        }

        inputStream.close();

        int max = 0;
        for (Integer amountByte : map.values()) {
            if(amountByte > max)
                max = amountByte;
        }

        for (Map.Entry entry : map.entrySet()){
            if(max == (int)entry.getValue()){
                System.out.println("" + entry.getKey());
            }
        }
    }
}
