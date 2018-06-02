package task18.task1813;

import java.io.*;

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "E:/result.txt";
    FileOutputStream component;

    public AmigoOutputStream(FileOutputStream fos) throws FileNotFoundException {
        super(fileName);
        this.component = fos;
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        component.flush();
        try{
            component.write("JavaRush © All rights reserved.".getBytes("UTF-8"));
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
        component.close();
    }

    public static void main(String[] args) throws IOException {
        AmigoOutputStream aos = new AmigoOutputStream(new FileOutputStream(fileName));
        aos.close();
    }
}
