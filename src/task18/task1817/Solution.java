package task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by User on 12.04.2018.
 */
public class Solution {
    public static void main(String[] args) {
        int count = 0;
        int countSpace = 0;
        try{
            FileInputStream in = new FileInputStream(args[0]);
            while (in.available() > 0){
                int data = in.read();
                if(data == (int) ' '){
                    countSpace++;
                }
                count++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%.2f", ((float) countSpace / count) * 100));
    }
}
