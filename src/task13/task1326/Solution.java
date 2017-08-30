package task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

/**
 * Created by User on 29.08.2017. 1.txt
 * C:\Users\User\IntelliJIDEAProjects\javarush\src\task13\task1326\1.txt
 * C:\Users\User\IntelliJIDEAProjects\javarush\src\task13\task1326\1.txt
 *
 * C:\Users\User\Desktop\
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        String screening = "\\";
        String dir = System.getProperty("user.dir") + screening + "src" + screening + "task13" + screening + "task1326" + screening;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*MyClass myObject = new MyClass();*/
        ArrayList<Integer> list = new ArrayList<>();
        String str = "";
        String file = reader.readLine();
        InputStream inStream = new FileInputStream(dir + file);
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inStream));


        try {

            /*while (fileReader.ready()) {
                myObject.write(Integer.parseInt(fileReader.readLine()));
            }
            fileReader.close();*/


            while ((str = fileReader.readLine()) != null){
                int x = Integer.parseInt(str);
                if (x % 2 == 0){
                    list.add(x);
                }

            }

        } catch (Exception e){

        } finally {
            fileReader.close();
        }

        reader.close();

        Collections.sort(list);
        for (Integer val : list){
            System.out.println(val);
        }

        /*for (Object val : myObject.sortArr()){
            System.out.println(val);
        }*/

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

        public ArrayList sortArr(){

            ArrayList resultList = new ArrayList();

            for (int i = 0; i < list.size(); i++){
                if (list.get(i) % 2 == 0){
                    resultList.add(list.get(i));
                }
            }

            Collections.sort(resultList);

            return resultList;
        }
    }
}
