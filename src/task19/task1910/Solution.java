package task19.task1910;

/*
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = bufferedReader.readLine();
        String fileOut = bufferedReader.readLine();
        bufferedReader.close();


        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
        while (fileReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            String s = fileReader.readLine();
            writer.write(s.replaceAll("\\p{Punct}", ""));
        }
        fileReader.close();
        writer.close();
    }
}
