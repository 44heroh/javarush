package task7.task0723;

/**
 * Created by User on 24.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
