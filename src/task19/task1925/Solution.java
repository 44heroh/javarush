package task19.task1925;

/*
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer outText = new StringBuffer();
        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] words = line.split(" ");
            for (String word : words){
                if(word.length() > 6){
                    outText.append(word).append(",");
                }
            }
        }
        fileReader.close();
        outText.delete(outText.length() - 1, outText.length());
        fileWrite.write(outText.toString());
        fileWrite.close();
    }
}
