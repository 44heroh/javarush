package task14.task1421;

/**
 * Created by User on 09.09.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
