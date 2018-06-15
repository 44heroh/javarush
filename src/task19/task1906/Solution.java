package task19.task1906;

/*
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = bufferedReader.readLine();
        String fileOut = bufferedReader.readLine();
        FileReader reader = new FileReader(fileIn);
        FileWriter writer = new FileWriter(fileOut);
        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            list.add(data);
        }

        for (int i = 1; i < list.size(); i = i + 2){
            writer.write(list.get(i));//пишем один символ (int будет обрезан/сужен до char)
        }

        //закрываем потоки после использования
        bufferedReader.close();
        reader.close();
        writer.close();
    }
}
