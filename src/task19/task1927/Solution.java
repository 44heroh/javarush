package task19.task1927;

/*
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new MyStream(new PrintStream(outputStream));
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //выводим ее в консоль
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    public static class MyStream extends PrintStream{

        private static int count = 1;
        private String adv = "\nJavaRush - курсы Java онлайн";

        private PrintStream printStream;

        public MyStream(OutputStream out) {
            super(out);
        }

        MyStream(PrintStream printStream) {
            super(printStream);
            this.printStream = printStream;
        }

        public void print(String s){
            if(MyStream.count % 2 == 0){
                printStream.print(s + adv);
            } else {
                printStream.print(s);
            }
            MyStream.count++;
        }
    }
}
