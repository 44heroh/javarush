package Mytags;

/*
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String path  = consoleReader.readLine();
        consoleReader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()){
            stringBuilder.append(fileReader.readLine());
        }
        fileReader.close();
        String data = stringBuilder.toString();

        String startTag = "<" + args[0];
        String endTag = "</" + args[0] + ">";
        int startTagIndex;
        int finalEndTagIndex = 0;
        int endTagIndex;
        int tempStartTagIndex = 0;
        boolean noShow = false;
        while(tempStartTagIndex != -1){
            startTagIndex = data.indexOf(startTag, tempStartTagIndex);
            if(startTagIndex == -1){
                return;
            }
            endTagIndex = data.indexOf(endTag, startTagIndex);
            if(finalEndTagIndex == endTagIndex){
                noShow = true;
            }
            tempStartTagIndex = data.indexOf(startTag, startTagIndex + 1);

            finalEndTagIndex = endTagIndex;

            if(tempStartTagIndex < endTagIndex && tempStartTagIndex != -1){
                endTagIndex = data.indexOf(endTag, endTagIndex + 1);
            }

            //Не показываем если tag входит в строку в которой он уже есть
            if(noShow == false){
                System.out.println(data.substring(startTagIndex, endTagIndex + endTag.length()));
            }
            noShow = false;
        }
    }
}
