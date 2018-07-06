package task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static ArrayList<String> fc1 = new ArrayList<String>();
    public static ArrayList<String> fc2 = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileread1 = new BufferedReader(new FileReader(file1));
        BufferedReader fileread2 = new BufferedReader(new FileReader(file2));

        while (fileread1.ready()){
            fc1.add(fileread1.readLine());
        }

        while (fileread2.ready()){
            fc2.add(fileread2.readLine());
        }

        fileread1.close();
        fileread2.close();

        for(int i = 0, j = 0; i < fc1.size() || j < fc2.size();){
            try {
                if(fc1.get(i).equals(fc2.get(j))){
                    lines.add( new LineItem(Type.SAME, fc1.get(i)));
                } else if(fc2.get(j).equals("") || fc2.get(j).length() == 0){
                    lines.add( new LineItem(Type.REMOVED, fc1.get(i)));
                } else if(fc1.get(i).equals("")){
                    lines.add( new LineItem(Type.ADDED, fc2.get(j)));
                } else {
                    lines.add( new LineItem(Type.REMOVED, fc1.get(i)));
                }
                i++;
                j++;
            } catch (IndexOutOfBoundsException e){
                j--;
            }
        }

        for (LineItem li: lines){
            System.out.println(li.type + " " + li.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
