package task13.task1307;

/**
 * Created by User on 28.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> //допишите здесь ваш код
    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
