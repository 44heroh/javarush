package task15.task1502;

/**
 * Created by User on 10.09.2017.
 */
public class Solution {
    public static class Goose extends SmallAnimal{
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static void main(String[] args) {
        SmallAnimal sa = new Goose();
        System.out.println(sa.getSize());
        BigAnimal ba = new Dragon();
        System.out.println(ba.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
