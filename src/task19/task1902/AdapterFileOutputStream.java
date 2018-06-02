package task19.task1902;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 16.05.2018.
 */
public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) {

    }

    @Override
    public void flush() throws IOException {
        this.fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        this.fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        this.fileOutputStream.close();
    }
}
