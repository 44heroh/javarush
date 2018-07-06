package task19.task1919;

/*
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String,Double> map = new TreeMap<String, Double>();
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
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
