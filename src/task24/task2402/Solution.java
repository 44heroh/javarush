package task24.task2402;

public class Solution {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        try {
            test1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Test2 test2 = new Test2();
        try {
            test2.clone(new Test2());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Test3 test3 = new Test3();
        try {
            test3.c1one();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Test4 test4 = new Test4();
        try {
            test4.c1one();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    public static class Test1 implements Cloneable {
        protected Test1 clone() throws CloneNotSupportedException {
            return (Test1)super.clone();
        }
    }

    public static class Test2 extends Test1 {
        public Test2 clone(Test2 test2) throws CloneNotSupportedException {
            return (Test2)test2.clone();
        }
    }

    public static class Test3 implements Cloneable {
        protected Object c1one() throws CloneNotSupportedException {
            return new Test3();
        }
    }

    public static class Test4 extends Test3 implements Cloneable {
        protected Object clone() throws CloneNotSupportedException {
            return super.c1one();
        }
    }
}
