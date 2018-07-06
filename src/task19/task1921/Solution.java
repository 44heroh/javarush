package task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        while(file.ready()){
            String str[] = file.readLine().split(" ");
            String name = "";
            int day, month, year;
            Date date;
            if(str.length == 6){
                name = str[0] + " " + str[1] + " " + str[2];
                day = Integer.parseInt(str[3]);
                month = Integer.parseInt(str[4]);
                year = Integer.parseInt(str[5]);
                date = new GregorianCalendar(year, month-1, day).getTime();
            } else {
                name = str[0];
                day = Integer.parseInt(str[1]);
                month = Integer.parseInt(str[2]);
                year = Integer.parseInt(str[3]);
                date = new GregorianCalendar(year, month-1, day).getTime();
            }
            Person person = new Person(name, date);
            PEOPLE.add(person);
        }
        file.close();

        for (Person pers : PEOPLE){
            System.out.println(pers.getName());
        }
    }
}
