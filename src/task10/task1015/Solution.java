package task10.task1015;

import java.util.ArrayList;

/**
 * Created by User on 07.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrList = new ArrayList[10];
        for(int i = 0; i < 10; i++){
            arrList[i] = new ArrayList<String>();
            for(int j = 0; j < 10; j++){
                arrList[i].add("Строка номер:" + j);
            }
        }
        return arrList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
