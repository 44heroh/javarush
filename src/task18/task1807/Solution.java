package task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String oct = "054";
        int dec = Integer.parseInt(oct, 8);
/*        System.out.println("В десятичной с.с. будет " + dec);
        System.out.println("Знак ASCII будет " + (char) dec);*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
//        FileInputStream inputStream = new FileInputStream("e:/data_task1807.txt");
        int count = 0;
        while (inputStream.available() > 0){
            if(inputStream.read() == dec){
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }

}
