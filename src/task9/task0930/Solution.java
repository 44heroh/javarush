package task9.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++){
            //Создаем строки переменную для замены в цикле
            String tmp = array[i];
            //Создаем int переменную для замены в цикле
            int index = i;
            //Начинаем со следующего значения в цикле
            for(int j = i + 1; j < array.length; j++){
                /*if((isNumber(tmp) && isNumber(array[j])) && (Integer.parseInt(tmp) < Integer.parseInt(array[j]))){
                    index = j;
                    tmp = array[j];
                } else if ((!(isNumber(tmp) && isNumber(array[j]))) && (isGreaterThan(tmp, array[j]))){
                    index = j;
                    tmp = array[j];
                }*/

                if(((isNumber(tmp) && isNumber(array[j])) && (Integer.parseInt(tmp) < Integer.parseInt(array[j]))) || ((!(isNumber(tmp) && isNumber(array[j]))) && (isGreaterThan(tmp, array[j])))){
                    //Приравниваем переменную для замены номера к текущему номеру элемента
                    index = j;
                    //Приравниваем переменную дял замены строки к текущей строке
                    tmp = array[j];
                }

            }
            //приравниваем элемент с номером переменной для замены номера к текущему элементу
            array[index] = array[i];
            //приравниваем текущий элемент к переменной строки для замены
            array[i] = tmp;
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
