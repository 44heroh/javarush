package classes;

import java.io.*;

/**
 * Created by User on 16.06.2018.
 */
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька ");
        Cat catWrap = new CatWrapper(cat);
        printName(catWrap);
    }

    static class Cat
    {
        private String name;
        public Cat(String name)
        {
            this.name = name;
        }

        public Cat() {

        }

        public String getName()
        {
            return this.name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }

    static class CatWrapper extends Cat
    {
        private Cat original;
        public CatWrapper (Cat cat)
        {
            super();
            this.original = cat;
        }

        public String getName()
        {
            return "Кот по имени " + original.getName();
        }

        public void setName(String name)
        {
            original.setName(name);
        }
    }

    public static void printName(Cat named)
    {
        System.out.println(named.getName());
    }
}
