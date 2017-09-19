package task9.taskStack1;

/**
 * Created by User on 18.09.2017.
 */
public class Solution
{
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement element : stackTraceElements)
        {
            count++;
            System.out.println("________" + count + "________");
            System.out.println(element.getMethodName());
            System.out.println(element.getClass());
            System.out.println(element.getLineNumber());
            System.out.println(element.hashCode());
            System.out.println(element.toString());
            System.out.println(element);
            System.out.println("________END________");
        }
    }
}
