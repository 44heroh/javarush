package task22.task2212;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if(telNumber.isEmpty())
            return false;
        if(telNumber.matches("^\\+\\d{12}"))
            return true;
        if(telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{7}"))
            return true;
        if(telNumber.matches("^\\+\\d{8}-\\d{2}-\\d{2}"))
            return true;
        if(telNumber.matches("\\d{6}-\\d{4}"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String tel = "+380501234567";
        System.out.println(checkTelNumber(tel));
        String tel1 = "+38(050)1234567";
        System.out.println(checkTelNumber(tel1));
        String tel2 = "+38050123-45-67";
        System.out.println(checkTelNumber(tel2));
        String tel3 = "050123-4567";
        System.out.println(checkTelNumber(tel3));
        String tel4 = "+38)050(1234567";
        System.out.println(checkTelNumber(tel4));
        String tel5 = "+38(050)1-23-45-6-7";
        System.out.println(checkTelNumber(tel5));
        String tel6 = "050ххх4567";
        System.out.println(checkTelNumber(tel6));
        String tel7 = "050123456";
        System.out.println(checkTelNumber(tel7));
        String tel8 = "(0)501234567";
        System.out.println(checkTelNumber(tel8));
    }
}
