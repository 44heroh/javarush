package task17.task1711;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("NAME NAME", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("NAME1 NAME1", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for(Person people : allPeople){
            System.out.println( people.getName() );
            System.out.println( people.getBirthDay() );
            System.out.println( people.getSex() );
        }
/*
        switch (args[0]){
            case "-c":
                for (int step = 1; step < args.length; step += 3){
                    Date date = null;
                    try {
                        date = dateFormat.parse(args[step + 2]);
                    } catch (ParseException e){
                        e.getMessage();
                    }

                    Person person;
                    if(args[step + 1].startsWith("м"))
                        person = Person.createMale(args[step], date);
                    else
                        person = Person.createFemale(args[step], date);

                    synchronized (allPeople){
                        allPeople.add(person);
                    }
                    System.out.println(allPeople.size() - 1);
                }
                break;

            case "-u":
                synchronized (allPeople){
                    for(int step = 1; step < args.length; step += 4){
                        int index = Integer.parseInt(args[step]);
                        Person person = allPeople.get(index);

                        person.setName(args[2]);

                        Date date = null;
                        try{
                            date = dateFormat.parse(args[step + 3]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        person.setBirthDay(date);

                        if(args[step + 2].startsWith("м"))
                            person.setSex(Sex.MALE);
                        else
                            person.setSex(Sex.FEMALE);

                    }

                }
                break;

            case "d":
                synchronized (allPeople){
                    for (int i = 0; i < args.length; i++){
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);

                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }

                }
                break;

            case "-i":
                synchronized (allPeople){
                    for(int i = 1; i < args.length; i++){
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        String sex = person.getSex() == Sex.MALE ? "м" : "ж";
                        System.out.println(person.getName() + " " + sex + " " + dateFormatPrt.format(person.getBirthDay()));
                    }
                }
                break;
        }
*/
    }
}
