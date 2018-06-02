package task18.task1823;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
E:\task1823.txt
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if(s.equals("exit")){
                break;
            }
            ReadThread rt = new ReadThread(s);
            rt.start();
        }
    }

    public static class ReadThread extends Thread {
        public String fileName;
        public Byte findByte;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run(){
            HashMap<Byte,Integer> map = new HashMap<Byte,Integer>();
            try {
                FileInputStream in = new FileInputStream(this.fileName);
                while (in.available() > 0){
                    byte[] buf = new byte[in.available()];
                    in.read(buf);
                    for (byte b : buf){
                        System.out.println(b);
                        if(map.containsKey(b)){
                            map.put(b, map.get(b) + 1);
                        } else {
                            map.put(b, 1);
                        }
                    }
                }
                in.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int max = 0;

            for (Map.Entry<Byte,Integer> pair : map.entrySet()) {
               if (max < pair.getValue()){
                   this.findByte = pair.getKey();
                   max = pair.getValue();
               }
            }

            synchronized (resultMap){
                resultMap.put(this.fileName, (int) this.findByte);
            }
        }
    }
}

