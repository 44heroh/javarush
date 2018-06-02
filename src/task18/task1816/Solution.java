package task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 10.04.2018.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try{
            FileInputStream in = new FileInputStream(args[0]);

            while(in.available() > 0){
                int data = in.read();
                if(data >= (int) 'A' && data <=  (int) 'Z' || data >= (int) 'a' && data <=  (int) 'z'){
                    count++;
                }
            }

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
    /*public static void main(String[] args) throws IOException {
        int count = 0;
        try{
            InputStreamReader isr = new InputStreamReader(new FileInputStream(args[0]));
            while(isr.ready()){
                char ch = (char) isr.read();
                if("qwertyuiopasdfghjklzxcvbnm".indexOf(Character.toLowerCase(ch)) > 0){
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }*/
}
