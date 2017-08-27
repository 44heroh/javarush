package task12.task1224;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String res = "";
        if(o instanceof Cat)
            res = "Кот";
        else if(o instanceof Tiger)
            res = "Тигр";
        else if(o instanceof Lion)
            res = "Лев";
        else if(o instanceof Bull)
            res = "Бык";
        else
            res = "хз";
        return res;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
