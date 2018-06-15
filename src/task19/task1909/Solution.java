package task19.task1909;

/*
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = bufferedReader.readLine();
        String fileOut = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        ArrayList<Character> result = new ArrayList<>();
        while (fileReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            result.add((char)fileReader.read());
        }
        fileReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
        for (Character item : result){
            if(item.equals('.')){
                writer.write('!');
            } else {
                writer.write(item);
            }

        }
        writer.close();
    }
}
