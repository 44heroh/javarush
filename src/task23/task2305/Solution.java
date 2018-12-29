package task23.task2305;

/*
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] arSol = new Solution[2];

        for(int i = 0; i < 2; i++){
            arSol[i] = new Solution();
        }

        for(int i = 0; i < 2; i++){
            arSol[i].innerClasses[0] = arSol[i].new InnerClass();
            arSol[i].innerClasses[1] = arSol[i].new InnerClass();
        }
        return arSol;
    }

    public static void main(String[] args) {
        Solution[] sol = getTwoSolutions();
        System.out.println(sol.length);
    }
}
