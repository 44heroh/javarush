package task15.task1507;

/**
 * Created by User on 11.09.2017.
 */
public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m) {
        System.out.println(m);
    }

    public static void printMatrix(String m) {
        System.out.println(m);
    }

    public static void printMatrix(double m) {
        System.out.println(m);
    }

    public static void printMatrix(int m, int n) {
        System.out.println(m + n);
    }

    public static void printMatrix(String m, String n) {
        System.out.println(m + n);
    }

    public static void printMatrix(double m, double n) {
        System.out.println(m + n);
    }

    public static void printMatrix(float m, float n) {
        System.out.println(m + n);
    }

    public static void printMatrix(float m) {
        System.out.println(m);
    }

}