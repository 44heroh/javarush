package task10.task1012;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int[] countChar = new int[abc.length()];
        for(String str: list){
            for(int i = 0; i < abc.length(); i++){
                for (int j = 0; j < str.length(); j++){
                    if(abcArray[i] == str.charAt(j)){
                        countChar[i]++;
                    }
                }
            }
        }
        for(int i = 0; i < abc.length(); i++){
            System.out.println(abcArray[i] + " " + countChar[i]);
        }
    }
}
