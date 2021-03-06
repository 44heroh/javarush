package task18.task1814;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Scanner;

import static java.lang.String.*;

/*
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    FileInputStream component;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if(fileName.endsWith(".txt")){
            this.component = new FileInputStream(fileName);
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    @Override
    public int read() throws IOException {
        return this.component.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return this.component.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return this.component.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return this.component.skip(n);
    }

    @Override
    public int available() throws IOException {
        return this.component.available();
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.component.close();
    }

    @Override
    public FileChannel getChannel() {
        return this.component.getChannel();
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        TxtInputStream txt = new TxtInputStream("E:/result.txt");
    }
}
