package task20.task2027;

import java.util.ArrayList;
import java.util.List;

/*
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static Word checkNw(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if (x < 0 || y < 0){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            if(x > 0 && y > 0){
                x--;
                y--;
            }
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkNe(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(x >= crossword[0].length || y < 0){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            x++;
            y--;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkN(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(y < 0){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            y--;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkW(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(x < 0 || y >= crossword[0].length){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            x--;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkSw(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(x < 0 || y >= crossword.length){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            x--;
            y++;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkS(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(y < 0 || y >= crossword.length){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            y++;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkSe(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(x >= crossword[0].length || y >= crossword.length){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            y++;
            x++;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x, y);
        return word;
    }

    public static Word checkE(int[][] crossword, int startX, int startY, String str){
        int x = startX;
        int y = startY;
        for(int i = 0; i < str.length(); i++){
            if(x >= crossword[0].length || y >= crossword.length){
                return null;
            }
            if((char)crossword[y][x] != str.charAt(i)){
                return null;
            }
            /*System.out.println((char)crossword[y][x]);
            System.out.println(" X = " + x + " Y = " + y);*/
            x++;
        }
        Word word = new Word(str);
        word.setStartPoint(startX, startY);
        word.setEndPoint(x - 1, y);
        return word;
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        ArrayList<Word> resWords = new ArrayList<>();

        for(String word : words){
            char latter = word.charAt(0);
            for(int y = 0; y < crossword.length; y++){
                for(int x = 0; x < crossword[y].length; x++ ) {
                    if((char)crossword[y][x] == latter){
                        Word[] vector = new Word[8];
                        vector[0] = checkNe(crossword, x, y, word);
                        vector[1] = checkN(crossword, x, y, word);
                        vector[2] = checkNw(crossword, x, y, word);
                        vector[3] = checkW(crossword, x, y, word);
                        vector[4] = checkSw(crossword, x, y, word);
                        vector[5] = checkS(crossword, x, y, word);
                        vector[6] = checkSe(crossword, x, y, word);
                        vector[7] = checkE(crossword, x, y, word);

                        for(int ii = 0; ii < vector.length; ii++){
                            if(vector[ii] != null){
                                System.out.println(vector[ii]);
                                resWords.add(vector[ii]);
                            }
                        }
                    }
                }
            }

        }
        return resWords;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
