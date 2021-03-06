package task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Составить цепочку слов
*/
/*public class Solution {
    public static void main(String[] args) {
        String[] words = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String fileName = reader.readLine();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                while(bufferedReader.ready()){
                    String str = bufferedReader.readLine();
                    words = str.split(" ");
                }
            } catch (NullPointerException e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        Arrays.sort(words);
        StringBuilder result = new StringBuilder();
        if(words.length == 0 || words == null) return result;
        if (words.length==1 || words[0].equals("")) return result.append(words[0]);
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList(words));
        while (wordList.remove("")){
            wordList.remove("");
        }

        wordList = isYes(wordList);
        for (String  word: wordList){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result;
    }

    public static ArrayList<String> isYes(ArrayList<String> wordList){
        ArrayList<String> resList = new ArrayList<>();
        for(int i = 0; i < wordList.size(); i++){
            char chFirst;
            int last = wordList.get(i).length()-1;//длина строки - 1, так как отсчет начинается с 0
            char chLast = wordList.get(i).charAt(last);
            for(int j = 1; j < wordList.size(); j++){
                chFirst = wordList.get(j).charAt(0);
                if(Character.toLowerCase(chFirst) == Character.toLowerCase(chLast)){
                    resList.add(wordList.get(i));
                }
            }
        }
        return resList;
    }
}*/
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //считываем имя файла с консоли
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        String[] words = reader.readLine().split(" ");                              //считываем в массив слова из файла
        StringBuilder result = getLine(words);
        System.out.println(result.toString().trim());                               //убираем лишний пробел в конце и выводим в консоль
    }

    public static StringBuilder getLine(String... words) {
        String[] words1 = new String[words.length];               //Новый массив создаем по причине того, что в условии программы
        System.arraycopy(words,0,words1,0,words.length);          //исходный массив изменять нельзя, поэтому работаем с копией
        Arrays.sort(words1);                                      //Сортировка массива здесь нужна только для валидатора,
        //на работоспособность программы этот метод никак не влияет
        ArrayList<ArrayList<String>> result = new ArrayList<>();  //Список всех возможных комбинаций слов (заполняется методом gGetWords)
        ArrayList<StringBuilder> finalList = new ArrayList<>();   //Список содержащий в себе только максимальные цепочки комбинаций слов

        gGetWords(0, result, words1);                             //Рекурсивный метод поиска всех комбинаций слов

        int chain = result.get(0).size();                         //chain здесь это значение максимальной длины цепочки
        //изначально это значение равно количеству слов в исходном массиве
        //однако, если максимальную цепочку получить не удается и одно слово
        //или несколько не вписываются в комбинацию, значение максимальной
        //цепочки уменьшается, пока finalList не начнет заполняться

        while (finalList.size() == 0) {
            chain--;
            for (ArrayList<String> res : result) {                //достаем из общего списка result подсписки комбинаций слов
                int check = 0;                                    //переменная для контроля chain - значения максимальной цепочки

                //В цикле сравниваем последнюю букву i-го слова
                //с первой буквой слова с индексом i + 1
                //по условию задачи они должны быть одинаковы
                //и увеличиваем значение check
                for (int i = 0; i < res.size() - 1; i++) {
                    if(res.get(i).toLowerCase().charAt(res.get(i).length() - 1) ==
                            res.get(i + 1).toLowerCase().charAt(0)){
                        check++;
                    }

                    //Если наша комбинация, как я описывал выше, может иметь лишние слова
                    //которые не попадают в "идеальную" цепочку,а значит параметр chain
                    //будет уменьшен на 1, то впоследствии мы можем столкнуться с такой комбинацией
                    //Сызрань Киев Вена Амстердам Мельбурн Нью-Йорк
                    //параметр check здесь соответствует параметру chain, но нужно учитывать
                    //что лишнее слово должно быть обязательно в конце основной цепочки
                    //для этого здесь стоит проверка на последовательность цепи сразу после
                    //инкрементирования check
                    if (check < i + 1) break;
                }

                //Здесь мы заполняем список значениями, соответствующими максимальному значение цепи chain
                if (check == chain) {
                    StringBuilder builder = new StringBuilder();
                    res.forEach(e -> builder.append(e).append(" "));
                    finalList.add(builder);
                }
            }
        }
        //на выходе даем первый StringBuilder из списка, содержащего только максимальные цепочки
        return finalList.get(0);
    }

    /*Рекурсивный метод для поиска всех возможных комбинаций исходных слов.
    ArrayList<ArrayList<String>> в данном случае это список, который содержит в себе список из различных
    комбинаций слов.
    Метод благополучно нашел в интернете, оптимизировав под данную задачу. */
    public static void gGetWords(int index, ArrayList<ArrayList<String>> result, String... words) {
        if (index > words.length - 1) {
            result.add(new ArrayList<>(Arrays.asList(words)));
        }

        for (int i = index; i < words.length; i++) {
            String temp = words[index];
            words[index] = words[i];
            words[i] = temp;

            gGetWords(index + 1, result, words);

            temp = words[index];
            words[index] = words[i];
            words[i] = temp;
        }
    }
}
