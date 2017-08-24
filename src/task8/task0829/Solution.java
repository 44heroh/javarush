package task8.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<Person> addresses = new ArrayList<Person>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String secondName = reader.readLine();
            addresses.add(new Person(city, secondName));
        }

        String city = reader.readLine();
        for(Person pers: addresses){
            if(pers.getCity().equals(city))
                System.out.println(pers.getSecondName());
        }
    }

    static class Person{
        private String city;
        private String secondName;

        public Person(String city, String secondName){
            this.city = city;
            this.secondName = secondName;
        }

        public String getCity(){
            return city;
        }

        public String getSecondName() {
            return secondName;
        }
    }
}
