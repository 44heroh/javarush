package task18.task1810;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
DownloadException
*/
public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task18" + screening + "task1810" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            FileInputStream inputStream = new FileInputStream(dir + reader.readLine());
            if (inputStream.available() < 1000){
                System.out.println(inputStream.available());
                inputStream.close();
                reader.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
