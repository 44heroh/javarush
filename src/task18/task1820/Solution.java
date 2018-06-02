package task18.task1820;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 13.04.2018.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        try {
            ArrayList<String> list = new ArrayList<>();
            BufferedReader b1 = new BufferedReader(new FileReader(file1));
            while(b1.ready()){
                list.add(b1.readLine());
            }
            b1.close();

            ArrayList<Long> listInt = new ArrayList<>();
            for(String str : list){
                for(String strPart : str.split(" ")){
                    double num = Double.parseDouble(strPart);
                    listInt.add(Math.round(num));
                }
            }

            FileWriter out2 = new FileWriter(file2);
            for(Long val : listInt){
                String lineSeparator = System.getProperty("line.separator");
                out2.write(val.toString() + lineSeparator);
            }
            out2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
