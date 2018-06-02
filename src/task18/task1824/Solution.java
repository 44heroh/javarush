package task18.task1824;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            try {
                FileInputStream in = new FileInputStream(fileName);
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                reader.close();
                return;
            }
        }
    }
}
