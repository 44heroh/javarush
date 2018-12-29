package task21.task2109;

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public B clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public C clone() throws ClassCastException{
            int i = getI();
            int j = getJ();
            String name = getName();
            return  new C(i, j, name);
        }
    }

    public static void main(String[] args) {
        C c = new C(1, 2, "C");
        B b = new B(1, 2 , "B");
        A a = new A(1, 2);

        C c1 = null;
        try {
            c1 = c.clone();
        } catch (ClassCastException e){
            e.printStackTrace();
        }

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c.getName());
        System.out.println(c1.getName());
    }
}
