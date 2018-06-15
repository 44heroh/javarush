package task19.task1907;

import java.io.*;

/*
Считаем слово
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        int count = 0;
        String word = "world";
        while (fileReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            String line = fileReader.readLine();
            String[] words = line.split("\\W");
            for (String str: words){
                if(str.equals(word)){
                    count++;
                }
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
