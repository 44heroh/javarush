package task13.task1322;

/**
 * Created by User on 29.08.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        StringObject<String> stringObject = new StringObject<String>();
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

    public static class StringObject<S> implements SimpleObject{

        @Override
        public StringObject<String> getInstance() {
            return null;
        }
    }
}
