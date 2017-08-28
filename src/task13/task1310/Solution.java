package task13.task1310;

/**
 * Created by User on 28.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person{
    }

    interface Boss extends Person, Workable{
    }

    class CleverMan implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean wantsToGetExtraWork() {
            return true;
        }
    }

    class SmartGirl implements Secretary{
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
