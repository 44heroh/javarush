package task20.task2021;

import java.io.*;

/*
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException{
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassCastException{
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
