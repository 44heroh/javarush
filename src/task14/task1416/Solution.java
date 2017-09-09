package task14.task1416;

/**
 * Created by User on 09.09.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal implements Swimmable {
        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Whale extends OceanAnimal implements Swimmable {

        @Override
        Swimmable getCurrentAnimal() {
            return this;
        }
    }

    static class Otter implements Swimmable, Walkable {

        public void walk() {
            System.out.println(this.getClass().getSimpleName() + " is walking.");
        }

        public void swim() {
            System.out.println(this.getClass().getSimpleName() + " is swimming.");
        }
    }
}
