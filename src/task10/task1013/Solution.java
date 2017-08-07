package task10.task1013;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 06.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Human hum = new Human();
        System.out.println(hum.Address);
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String FirstName;
        private String SecondName;
        private int Age;
        private char Sex;
        private Date Birthday;
        private String Address;

        public Human(){
            this.FirstName = "";
            this.SecondName = "";
            this.Age = 13;
            this.Sex = 'M';
            this.Address = "NY 7 Avenu";
            this.Birthday = new Date("MAY 1 2004");
        }

        public Human(Human hm){
            this.FirstName = hm.FirstName;
            this.SecondName = hm.SecondName;
            this.Age = hm.Age;
            this.Sex = hm.Sex;
            this.Address = hm.Address;
            this.Birthday = hm.Birthday;
        }

        public Human(String _FirstName){
            this.FirstName = _FirstName;
            this.SecondName = "";
            this.Age = 13;
            this.Sex = 'M';
            this.Address = "NY 7 Avenu";
            this.Birthday = new Date("MAY 1 2004");
        }
        public Human(String _FirstName, String _SecondName){
            this.FirstName = _FirstName;
            this.SecondName = _SecondName;
            this.Age = 13;
            this.Sex = 'M';
            this.Address = "NY 7 Avenu";
            this.Birthday = new Date("MAY 1 2004");
        }
        public Human(String _FirstName, String _SecondName, int _Age){
            this.FirstName = _FirstName;
            this.SecondName = _SecondName;
            this.Age = _Age;
            this.Sex = 'M';
            this.Address = "NY 7 Avenu";
            this.Birthday = new Date("MAY 1 2004");
        }
        public Human(String _FirstName, String _SecondName, int _Age, char _Sex){
            this.FirstName = _FirstName;
            this.SecondName = _SecondName;
            this.Age = _Age;
            this.Sex = _Sex;
            this.Address = "NY 7 Avenu";
            this.Birthday = new Date("MAY 1 2004");
        }
        public Human(String _FirstName, String _SecondName, int _Age, char _Sex, String _Address, Date _Birthday){
            this.FirstName = _FirstName;
            this.SecondName = _SecondName;
            this.Age = _Age;
            this.Sex = _Sex;
            this.Address = _Address;
            this.Birthday = _Birthday;
        }
    }
}
