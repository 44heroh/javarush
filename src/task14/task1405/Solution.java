package task14.task1405;

/**
 * Created by User on 30.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.eat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void eat() {
            System.out.println("food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("food was selected");
        }
    }
}
