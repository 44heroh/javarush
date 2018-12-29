package transientLesoon;

import java.io.*;

/**
 * Created by User on 12.07.2018.
 */
public class Solution implements Serializable {
    public String name;
    public int age;
    public int weight;

    transient public InputStream in = System.in;
}
