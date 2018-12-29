package task20.task2013;

import java.io.*;
import java.util.Arrays;
import java.util.List;


/*
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person() {}

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person) in.readObject();
            father = (Person) in.readObject();
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            age = in.readInt();
            children = (List<Person>) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("3", "3", 25);
        person.setFather(new Person("1", "1", 45));
        person.setMother(new Person("2", "2", 43));
        person.setChildren(Arrays.asList(new Person("4", "4", 2), new Person("5", "5", 1)));

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\IntelliJIDEAProjects\\javarush\\src\\task20\\task2013\\in.txt"));
        person.writeExternal(outputStream);

        Person p = new Person("1", "2", 2);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\IntelliJIDEAProjects\\javarush\\src\\task20\\task2013\\in.txt"));
        p.readExternal(inputStream);

        System.out.println(person);
        System.out.println(p);
    }
}
