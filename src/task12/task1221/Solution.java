package task12.task1221;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        public String getName(){
            return "Я - кот";
        }
    }
}
