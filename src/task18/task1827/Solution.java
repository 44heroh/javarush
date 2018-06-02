package task18.task1827;

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
        if(args[0].equals("-c")){
            String last = list.get(list.size() - 1);
            int idLastString = Integer.parseInt(last.substring(0, 8).trim()) + 1;

            BufferedWriter out = new BufferedWriter( new FileWriter(fileName, true));
//            out.newLine();
            out.write(String.format("%n%-8d%-30s%-8s%s",idLastString, args[1], args[2], args[3]));
            System.out.println(String.format("%n%-8d%-30s%-8s%s",idLastString, args[1], args[2], args[3]));
//            System.out.println(String.format("%3d%9.30s%30.8s%4.4s",idLastString, args[1], args[2], args[3]));
            out.close();
        }
        in.close();
        reader.close();
    }
}
