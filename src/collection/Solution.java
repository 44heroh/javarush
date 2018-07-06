package collection;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Испания");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        //ArrayList
        for(String str : states){
            System.out.println(str);
        }

        //Map
        Map<String, String> map = new HashMap<>();
        map.put("1", "Понедельник");
        map.put("2", "Вторник");
        map.put("3", "Среда");

        // Map.Entry - описываем пару (ключ - значение) "3=Среда" и т.п.
        // entrySet - возращает множество со значениями карты, т.е. [3=Среда, 2=Вторник, 1=Понедельник]


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
        }

        System.out.println();

        // Iterator - интерфейс, для организации цикла для перебора коллекций
        // hasNext - true, если есть еще элементы
        // next - возвращает слудующий элемент

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("ID = " + entry.getKey() + " День недели = " + entry.getValue());
        }

        System.out.println();

        // keySet - возвращает множество ключей

        for (String key : map.keySet()) {
            System.out.println("ID = " + key + ", День недели = " +  map.get(key));
        }
        System.out.println();

        //Set
        Set<String> countryHashSet = new HashSet<>();
        countryHashSet.add("Россия");
        countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов
        countryHashSet.add("Франция");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар"); // кот попросил добавить ещё раз для надёжности

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
