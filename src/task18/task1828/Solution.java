package task18.task1828;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 11.05.2018.
 * E:\task1827\out.txt
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = null;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        while(in.ready()){
            list.add(in.readLine());
        }
        switch (args[0]){
            case "-c" :
                String last = list.get(list.size() - 1);
                int idLastString = Integer.parseInt(last.substring(0, 8).trim()) + 1;
                list.add(String.format("%n%-8d%-30s%-8s%s",idLastString, args[1], args[2], args[3]));
                break;
            case "-u" :
                for (int i = 0; i < list.size(); i++){
                    if(list.get(i).substring(0, 8).trim().equals(args[1])){
                        String result = String.format("%n%-8s%-30s%-8s%s",args[1], args[2], args[3], args[4]);
                        list.set(i, result);
                    }
                }
                break;
            case "-d" :
                boolean del = false;
                for (int i = 0; i < list.size(); i++){
                    if(list.get(i).substring(0, 8).trim().equals(args[1]) && del == false){
                        list.remove(i);
                    }
                }
                break;
        }
        BufferedWriter outU = new BufferedWriter(new FileWriter(fileName));
        for(String str : list){
            outU.write(str);
        }
        outU.close();
        in.close();
        reader.close();
    }
}

