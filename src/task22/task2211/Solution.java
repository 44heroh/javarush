package task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);

        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        outputStream.write(new String(buffer, "Windows-1251").getBytes("UTF-8"));

        inputStream.close();
        outputStream.close();
    }
}
