package task18.task1812;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        new QuestionFileOutputStream(new AmigoOutputStream() {
            @Override
            public void flush() throws IOException {

            }

            @Override
            public void write(int b) throws IOException {

            }

            @Override
            public void write(byte[] b) throws IOException {

            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {

            }

            @Override
            public void close() throws IOException {

            }
        });
    }
}
