package task19.task1926;

/*
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileIn = new BufferedReader(new FileReader(fileReader.readLine()));
        fileReader.close();

        while (fileIn.ready()){
            String line = fileIn.readLine();
            StringBuffer str = new StringBuffer(line);
            System.out.println(str.reverse());
        }

        fileIn.close();
    }
}
