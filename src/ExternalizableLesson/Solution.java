package ExternalizableLesson;

import java.io.*;

/**
 * Created by User on 12.07.2018.
 */
public class Solution implements Externalizable
{
    public String name;
    public int age;
    public int weight;

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(weight);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        weight = in.readInt();
    }
}
