package SerializableLesson;

import java.io.*;

/**
 * Created by User on 12.07.2018.
 */
public class Solution {
    public static void main(String[] args) throws Exception
    {
        Cat cat = new Cat();

        //save cat to file
        FileOutputStream fileOutput = new FileOutputStream("cat.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(cat);
        fileOutput.close();
        outputStream.close();

        //load cat from file
        FileInputStream fiStream = new FileInputStream("cat.dat");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        fiStream.close();
        objectStream.close();

        Cat newCat = (Cat)object;
    }

    static class Cat implements Serializable
    {
        public String name;
        public int age;
        public int weight;
    }
}
