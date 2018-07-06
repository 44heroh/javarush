package task19.task1923;

/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(args[1]));

        while (fileIn.ready()){
            String str = fileIn.readLine();
            String[] words = str.split(" ");
            for (String word : words){
                if(word.matches(".*\\d+.*")){
                    System.out.println(word);
                    fileOut.write(word + " ");
                }
            }
        }
        fileIn.close();
        fileOut.close();
    }
}
