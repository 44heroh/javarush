package task12.task1215;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName(){
            return "";
        }
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        public String getName(){
            return "";
        }
        public Pet getChild(){
            return new Dog();
        }

    }
}
