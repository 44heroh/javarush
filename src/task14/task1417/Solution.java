package task14.task1417;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
            allMoney.add(new Hrivna(23.4));
            allMoney.add(new USD(2.2));
            allMoney.add(new Ruble(175.4));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

