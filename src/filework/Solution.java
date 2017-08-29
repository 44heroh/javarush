package filework;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 29.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws IOException
    {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "filework" + screening;
        InputStream inStream = new FileInputStream(dir + "1.txt");
        OutputStream outStream = new FileOutputStream(dir + "2.txt");
        MyClass myObject = new MyClass();

        while (inStream.available() > 0)
        {
            int data = inStream.read();//читаем один байт из потока для чтения
            try {
                myObject.write(data);
            } catch (Exception e){

            }
        }

        while (myObject.available() > 0)
        {
            int data = myObject.read();
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();
    }

    public static class MyClass
    {
        private ArrayList<Integer> list = new ArrayList<>();
        public void write (int data)
        {
            list.add(data);
        }
        public int read()
        {
            int first = list.get(0);
            list.remove(0);
            return first;
        }

        public int available()
        {
            return list.size();
        }
    }
}
