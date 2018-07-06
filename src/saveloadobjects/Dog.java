package saveloadobjects;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * Created by User on 28.06.2018.
 */
public class Dog {
    public String name;
    public int age;

    public void save(PrintWriter writer) throws Exception {
        writer.println(name);
        writer.println(age);
        writer.flush();
    }

    public void load(BufferedReader reader) throws Exception {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
    }
}
