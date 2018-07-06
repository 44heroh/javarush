package task19.task1915;

/*
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String fileOut = bufferedReader.readLine();
        bufferedReader.close();*/
        String fileOut = "C:\\Users\\User\\IntelliJIDEAProjects\\javarush\\src\\task19\\task1915\\out.txt";
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);
        String res = outputStream.toString();
        FileOutputStream out = new FileOutputStream(fileOut);
        outputStream.writeTo(out);
        System.out.println(res);
        out.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
