package task18.task1808;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task18" + screening + "task1808" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(dir + reader.readLine());
        FileOutputStream outStream2 = new FileOutputStream(dir + reader.readLine());
        FileOutputStream outStream3 = new FileOutputStream(dir + reader.readLine());
        int count =  inputStream1.available();
        while (inputStream1.available() > 0){
            int length2file = 0;
            if(count % 2 == 0){
                length2file = count / 2;
            } else {
                length2file = count / 2 + 1;
            }
            byte[] buffer2 = new byte[length2file];
            outStream2.write(buffer2, 0, inputStream1.read(buffer2));
            byte[] buffer3 = new byte[count / 2];
            outStream3.write(buffer3, 0, inputStream1.read(buffer3));
        }
        reader.close();
        inputStream1.close();
        outStream2.close();
        outStream3.close();
    }
}
