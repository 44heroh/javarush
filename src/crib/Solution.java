package crib;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 04.03.2018.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException, IOException {
        /*//ArrayList - iterator
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

        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();

        Thread.sleep(500);

        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        thread1.join();*/

        /*Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();*/

        /*MyClass my = new MyClass();

        Clock1 clock1 = new Clock1();
        Thread clockThread1 = new Thread(clock1);
        clockThread1.start();

        Thread.sleep(10000);
        clock1.cancel();*/

        //Создаем поток-чтения-байт-из-файла
//        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
//        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        /*byte[] buffer = new byte[1000];
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();*/

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
        }*/

        Cat cat = new Cat("Васька ");
        Cat catWrap = new CatWrapper (cat);
        printName(catWrap);

        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }

    public static class Printer implements Runnable {
        private String name;
        public Printer(String name)
        {
            this.name = name;
        }

        public Printer() {
            this.name = "printer";
        }

        public void run()
        {
            System.out.println("I’m " + this.name);
        }
    }

    public static class Clock implements Runnable
    {
        public void run()
        {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted())
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }

    public static class MyClass
    {
        private static String name1 = "Оля";
        private static String name2 = "Лена";

        public synchronized void swap()
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }

        public static synchronized void swap2()
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    public static class Clock1 implements Runnable
    {
        private volatile boolean isCancel = false;

        public void cancel()
        {
            this.isCancel = true;
        }

        public void run()
        {
            while (!this.isCancel)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }

    static class Cat
    {
        private String name;
        public Cat(String name)
        {
            this.name = name;
        }

        public Cat() {

        }

        public String getName()
        {
            return this.name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }

    static class CatWrapper extends Cat
    {
        private Cat original;
        public CatWrapper (Cat cat)
        {
            super();
            this.original = cat;
        }

        public String getName()
        {
            return "Кот по имени " + original.getName();
        }

        public void setName(String name)
        {
            original.setName(name);
        }
    }

    public static void printName(Cat named)
    {
        System.out.println(named.getName());
    }

    public static class Singleton {
        private static Singleton instance;
        private Singleton() {
            this.instance = this;
        }

        public static Singleton getInstance(){
            if(instance == null){
                return new Singleton();
            }
            return instance;
        }
    }
}
