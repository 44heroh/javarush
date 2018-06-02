package reverse;

import java.util.ArrayList;

/**
 * Created by User on 11.03.2018.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer val : reverse1(list)) {
            System.out.println(val);
        }
    }

    public static ArrayList<Integer> reverse1(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }

        return list;
    }
}
