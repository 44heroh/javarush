package task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();*/
//        System.out.println(fileName1);
//        System.out.println(fileName2);
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task17" + screening + "task1721" + screening;
        BufferedReader file1 = new BufferedReader(new FileReader(dir + reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(dir + reader.readLine()));
        while(file1.ready()){
            allLines.add(dir + file1.readLine());
        }
        file1.close();
        while(file2.ready()){
            forRemoveLines.add(dir + file2.readLine());
        }
        file2.close();
        /*try{
            BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream(dir + fileName1)));
            while (file1.ready()){
                System.out.println(file1.readLine());
                allLines.add(file1.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName1 + " not found");
        } catch (IOException e) {
            System.out.println("Can't Read File " + fileName1);
        }

        try{
            BufferedReader file2 = new BufferedReader(new InputStreamReader(new FileInputStream(dir + fileName2)));
            while (file2.ready()){
                System.out.println(file2.readLine());
                forRemoveLines.add(file2.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName2 + " not found");
        } catch (IOException e) {
            System.out.println("Can't Read File " + fileName2);
        }*/

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e){

        }

    }

    public void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
