package task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sbResult = new StringBuilder();
        for(Map.Entry<String, String> entry : params.entrySet()){
            if(entry.getValue() != null){
                sbResult.append(entry.getKey() + " = '" + entry.getValue() + "' and ");
            }
        }

        if(sbResult.length() > 5){
            sbResult.delete(sbResult.length() - 5, sbResult.length());
        }

        return sbResult.toString();
    }
}

