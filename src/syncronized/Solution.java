package syncronized;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        MyClass my = new MyClass();
        my.swap();
        my.swap2();
    }
    public static class MyClass
    {
        private static String name1 = "Оля";
        private static String name2 = "Лена";

        public synchronized void swap()
        {
            System.out.println("swap");
            String s = name1;
            System.out.println(s);
            name1 = name2;
            System.out.println(name1);
            name2 = s;
            System.out.println(name2);
        }

        public static synchronized void swap2()
        {
            System.out.println("swap2");
            String s = name1;
            System.out.println(s);
            name1 = name2;
            System.out.println(name1);
            name2 = s;
            System.out.println(name2);
        }
    }
}
