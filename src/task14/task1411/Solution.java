package task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        String str;
        //тут цикл по чтению ключей, пункт 1
        while (true)
        {
            str = reader.readLine();
            //создаем объект, пункт 2
            if (str.equals("user")){
                person = new Person.User();
                doWork(person); //вызываем doWork
                continue;
            }
            if (str.equals("loser")){
                person = new Person.Loser();
                doWork(person); //вызываем doWork
                continue;
            }
            if (str.equals("coder")){
                person = new Person.Coder();
                doWork(person); //вызываем doWork
                continue;
            }
            if (str.equals("proger")){
                person = new Person.Proger();
                doWork(person); //вызываем doWork
                continue;
            }
            break;
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof Person.User){
            ((Person.User) person).live();
        }

        if(person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }

        if(person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }

        if(person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
