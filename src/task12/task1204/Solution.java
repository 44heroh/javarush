package task12.task1204;

/**
 * Created by User on 24.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        /*String className = o.getClass().getSimpleName();
        switch (className){
            case "Cat":
                System.out.println(className + "11111");
                break;
            case "Bird":
                System.out.println(className + "22222");
                break;
            case "Lamp":
                System.out.println(className + "33333");
                break;
            case "Dog":
                System.out.println(className + "44444");
                break;
        }*/
        if(o instanceof Cat)
            System.out.println("Кошка");
        if(o instanceof Bird)
            System.out.println("Птица");
        if(o instanceof Lamp)
            System.out.println("Лампа");
        if(o instanceof Dog)
            System.out.println("Собака");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
