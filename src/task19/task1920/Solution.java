package task19.task1920;

/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String,Double> map = new TreeMap<>();
        Double max = Double.MIN_VALUE;
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        while(file.ready()){
            String str[] = file.readLine().split(" ");
            String lastName = str[0];
            Double price = Double.parseDouble(str[1]);
            if(!map.containsKey(lastName)){
                map.put(lastName, price);
            } else {
                map.put(lastName, map.get(lastName) + price);
            }
        }
        file.close();

        for (Map.Entry<String, Double> pair : map.entrySet()){
            if(max < pair.getValue()){
                max = pair.getValue();
                System.out.println(pair.getKey());
            }
        }
    }
}
