package task13.task1315;

/**
 * Created by User on 29.08.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Eat, Eatable{

        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Dog implements Movable, Eat{

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Movable, Eatable{

        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }
    }
}
