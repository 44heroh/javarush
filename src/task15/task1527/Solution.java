package task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String params = s.substring(s.indexOf("?") + 1);
        String[] paramsSub;
        paramsSub = params.split("&");

        LinkedHashMap<String, String> parameters = new LinkedHashMap<String, String>();
        for(int i = 0; i < paramsSub.length; i++){
            int positionChar = paramsSub[i].indexOf("=");
            if(positionChar < 0){
                parameters.put(paramsSub[i], null);
                continue;
            }

            String key = paramsSub[i].substring(0, positionChar);
            String value = paramsSub[i].substring(positionChar + 1);

            parameters.put(key, value);
        }

        for(String key : parameters.keySet()){
            System.out.print(key + " ");
        }

        System.out.println();

        String obj = parameters.get("obj");
        if(obj == null)
            return;

        try{
            alert(Double.parseDouble(obj));
        } catch (NumberFormatException e){
            alert(obj);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
