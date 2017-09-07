package task14.task1409;

/**
 * Created by User on 07.09.2017.
 */
public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge obj) {
        System.out.println(obj.getCarsCount());
    }

}
