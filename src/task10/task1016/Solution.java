package task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 08.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        for(Map.Entry entry : result.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
        for(String str : list){
            if(result.containsKey(str)){
                result.put(str, result.get(str) + 1);
            } else {
                result.put(str, 1);
            }
        }

        return result;
    }
}
