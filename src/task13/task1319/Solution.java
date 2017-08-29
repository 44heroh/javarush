package task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));

        String str = "";
        while (!str.equals("exit")){
            str = reader.readLine();
            file.write(str);
            file.newLine();
        }

        file.close();
        reader.close();
    }
}
