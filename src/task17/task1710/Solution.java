package task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


        if(args[0].startsWith("-c")){
            Date date = null;
            try {
                date = dateFormat.parse(args[3]);
            } catch (ParseException e) {
                e.getMessage();
            }

            if(args[2].startsWith("м")){
                Person person = Person.createMale(args[1], date);
                allPeople.add(person);
            } else {
                Person person = Person.createFemale(args[1], date);
                allPeople.add(person);
            }
            System.out.println(allPeople.size() - 1);
        }

        if(args[0].startsWith("-u")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);

            person.setName(args[2]);

            Date date = null;
            try{
                date = dateFormat.parse(args[4]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            person.setBirthDay(date);

            if(args[3].startsWith("м"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
        }

        if(args[0].startsWith("-d")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);

            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }

        if(args[0].startsWith("-i")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            String sex = person.getSex() == Sex.MALE ? "м" : "ж";
            System.out.println(person.getName() + " " + sex + " " + dateFormatPrt.format(person.getBirthDay()));
        }
    }
}
