package task12.task1218;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Move, Eat{
        public void move(){

        }
        public void eat(){

        }
    }

    public class Duck implements Move, Eat, Fly{
        public void move(){

        }
        public void eat(){

        }
        public void fly(){

        }
    }

    public class Car implements Move{
        public void move(){

        }
    }

    public class Airplane implements Move, Fly{
        public void move(){

        }
        public void fly(){

        }
    }
}
