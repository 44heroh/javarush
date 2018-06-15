package task19.task1908;

import java.io.*;

/**
 * Created by User on 04.06.2018.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = bufferedReader.readLine();
        String fileOut = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        String line = null;
        while (fileReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            line = fileReader.readLine();
        }
        fileReader.close();

        String[] words = line.split("\\W");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
        for (String item : words){
            if(item.matches("\\d+")){
                writer.write(item + " ");
            }
        }
        writer.close();
    }
}
