package task15.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(12d, "a");
        labels.put(13d, "b");
        labels.put(14d, "c");
        labels.put(15d, "d");
        labels.put(16d, "e");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
