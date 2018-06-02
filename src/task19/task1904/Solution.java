package task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
И еще один адаптер
*/
public class Solution {

    public static void main(String[] args) {
        Scanner scaner = new Scanner("E:/task1904.txt");
        PersonScannerAdapter psa = new PersonScannerAdapter(scaner);

        System.out.println(psa);

        String[] strings = new String[3];
        strings[0] = "23312231231";
        strings[1] = "weqweqqweeqeqw";
        strings[2] = "asdsdassdadsasd";
        Util.debug(strings);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if(fileScanner.hasNext()){
                String str = fileScanner.nextLine();
                String[] parts = str.split(" ");
                String lastName = parts[0];
                String firstName = parts[1];
                String middleName = parts[2];
                Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[5]), Integer.parseInt(parts[4]) - 1, Integer.parseInt(parts[3]));

                person = new Person(firstName, middleName, lastName, calendar.getTime());
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
