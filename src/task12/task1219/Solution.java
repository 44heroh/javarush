package task12.task1219;

/**
 * Created by User on 27.08.2017.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements Run, Swim {
        public void run(){

        }
        public void swim(){

        }
    }

    public class Duck implements Run, Swim, Fly{
        public void run(){

        }
        public void swim(){

        }
        public void fly(){

        }
    }

    public class Penguin implements Run, Swim {
        public void run(){

        }
        public void swim(){

        }
    }

    public class Airplane implements Run , Fly{
        public void run(){

        }
        public void fly(){

        }
    }
}
