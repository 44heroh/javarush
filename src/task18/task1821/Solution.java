package task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        TreeMap<Byte, Integer> map = new TreeMap<>();
        try{
            FileInputStream in = new FileInputStream(args[0]);
            while (in.available() > 0){
                byte[] buf = new byte[in.available()];
                in.read(buf);
                for(int i = 0; i < buf.length; i++){
                    if(map.containsKey(buf[i])){
                        map.put(buf[i], map.get(buf[i]) + 1);
                    } else {
                        map.put(buf[i], 1);
                    }
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
            System.out.println((char)(byte)entry.getKey() + " " + entry.getValue());
        }
    }
}
