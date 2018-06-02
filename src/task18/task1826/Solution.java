package task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] key = new byte[] {};
        FileInputStream inForArr = new FileInputStream(args[1]);
        while (inForArr.available() > 0){
            byte[] keys = new byte[inForArr.available() + 1];
            byte[] buf = new byte[inForArr.available()];
            inForArr.read(buf);
            for(int i = 0; i < buf.length; i++) {
                keys[i] = (byte) i;
                System.out.println(keys[i]);
            }
            key = keys;
        }
        inForArr.close();
        switch (args[0]){
            case "-e" : {
                FileInputStream in = new FileInputStream(args[1]);
                FileOutputStream out = new FileOutputStream(args[2]);
                while (in.available() > 0){
                    byte[] buf = new byte[in.available()];
                    in.read(buf);
                    int j = 0;
                    for(int i = 0; i < buf.length; i++){
                        System.out.println((char)(byte)buf[i]);
                        buf[i] = (byte) (buf[i] ^ key[i]);
                        System.out.println((char)(byte)buf[i]);
                        if(j > key.length)
                            j = 0;
                    }
                    out.write(buf);
                }
                in.close();
                out.close();
                break;
            }
            case "-d" : {
                FileInputStream in = new FileInputStream(args[1]);
                FileOutputStream out = new FileOutputStream(args[2]);
                while (in.available() > 0){
                    byte[] buf = new byte[in.available()];
                    in.read(buf);
                    int j = 0;
                    for(int i = 0; i < buf.length; i++){
                        System.out.println((char)(byte)buf[i]);
                        buf[i] = (byte) ((byte) (buf[i] ^ key[i]) ^ (byte) key[i]);
                        System.out.println((char)(byte)buf[i]);
                        if(j > key.length)
                            j = 0;
                    }
                    out.write(buf);
                }
                in.close();
                out.close();
                break;
            }
        }
    }
}
