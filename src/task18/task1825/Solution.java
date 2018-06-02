package task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> files = new TreeSet<String>();
        while (true) {
            String s = reader.readLine();
            if(s.equals("end")){
                break;
            } else {
                files.add(s);
            }
        }
        reader.close();
        FileInputStream in = null;
        FileOutputStream  out = new FileOutputStream(files.first().split(".part")[0]);
        for (String str : files){
            if(str.indexOf(".part") > 0){
                in = new FileInputStream(str);
                byte[] buf = new byte[in.available()];
                in.read(buf);
                out.write(buf);
                in.close();
            }
        }
        out.close();
        System.out.println("Объединение файлов выполнено!");
    }
}
