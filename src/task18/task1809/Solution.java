package task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task18" + screening + "task1809" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(dir + reader.readLine());
        FileOutputStream outStream2 = new FileOutputStream(dir + reader.readLine());
        int count =  inputStream1.available();
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream1.available() > 0){
            int data = inputStream1.read();
            list.add(data);
        }
        Collections.reverse(list);
        for(int val : list){
            outStream2.write(val);
        }
        reader.close();
        inputStream1.close();
        outStream2.close();
    }
}
