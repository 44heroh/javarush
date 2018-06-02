package task18.task1819;

import java.io.*;

/**
 * Created by User on 12.04.2018.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        try {
            FileInputStream in1 = new FileInputStream(file1);
            byte[] b1 = new byte[in1.available()];
            in1.read(b1);
            in1.close();

            FileInputStream in2 = new FileInputStream(file2);
            byte[] b2 = new byte[in2.available()];
            in2.read(b2);
            in2.close();

            FileOutputStream out1 = new FileOutputStream(file1);
            out1.write(b2);
            out1.close();

            FileOutputStream out2 = new FileOutputStream(file1, true);
            out2.write(b1);
            out2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
