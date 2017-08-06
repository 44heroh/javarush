package task10.task1011;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        /*char[] chArray = s.toCharArray();
        for(char c : chArray){
            System.out.println(s.substring(1));
        }*/
        for(int i = 0; i < 40; i++)
        {
            System.out.println(s.substring(i));
        }
    }
}
