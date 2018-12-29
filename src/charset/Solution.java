package charset;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

public class Solution {

    public static void main(String[] args) {
        //преобразовать в число, а число в символ
        char c = 'A'; //код(число) буквы А – 65
        c++; //Теперь с содержит число 66 – код буквы B
        System.out.println(c);

        // получить список всех кодировок
        SortedMap<String,Charset> charsets = Charset.availableCharsets();
        /*for(Map.Entry<String,Charset> charStr : charsets.entrySet()){
            System.out.println(charStr.getKey() + " - " + charStr.getValue());
        }*/

        // получить текущую активную кодировку
        Charset currentCharset = Charset.defaultCharset();
        System.out.println(currentCharset);

        String s = "Good news everyone!";
        byte[] buffer = s.getBytes();

        for (byte arByte : buffer){
//            System.out.println(arByte);
        }

        String s1 = "Good news everyone!";
        Charset koi8 = Charset.forName("KOI8-R");
        byte[] buffer1 = s1.getBytes(koi8);

        for (byte arByte : buffer1){
            System.out.println((char)arByte);
        }
    }
}
