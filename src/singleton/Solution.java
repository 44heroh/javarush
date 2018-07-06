package singleton;

public class Solution {
    public static void main(String[] args) {
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
    public static class Singleton {
        private static Singleton instance;
        private Singleton() {
            this.instance = this;
        }

        public static Singleton getInstance(){
            if(instance == null){
                return new Singleton();
            }
            return instance;
        }
    }
}
