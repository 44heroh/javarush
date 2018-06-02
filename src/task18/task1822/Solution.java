package task18.task1822;

//E:\task1822.txt

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();

        try{
            BufferedReader b1 = new BufferedReader(new FileReader(file1));
            while(b1.ready()){
                String str = b1.readLine();
                if(str.startsWith(args[0] + " ")){
                    System.out.println(str);
                }
            }
            b1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
