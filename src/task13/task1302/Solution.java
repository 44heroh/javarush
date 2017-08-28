package task13.task1302;

/**
 * Created by User on 28.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }
}
