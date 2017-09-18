package task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader freader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME), "Windows-1251"));

            while (freader.ready()) {
                String s = freader.readLine();
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" not found!");
        } catch (IOException e){
            System.out.println("ERROR: File "+Statics.FILE_NAME+" not found!");
        }
    }

    public static void main(String[] args) {
        for (String line : lines){
            System.out.println(line);
        }
    }
}
