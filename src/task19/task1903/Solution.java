package task19.task1903;

/*
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {

        //+38(050)123-45-67
        int uaTel = 501234567;
        getNumberPhone(uaTel);

    }

    private static String getNumberPhone(Integer tel) {
        String full = String.format("%010d", tel);
        String tel1 = full.substring(0, 3);
        String tel2 = full.substring(3, 6);
        String tel3 = full.substring(6, 8);
        String tel4 = full.substring(8, 10);
        String res = "+38" + "(" + tel1 + ")" + tel2 + "-" + tel3 + "-" + tel4;
        System.out.println(res);
        return "";
    }

    public static class IncomeDataAdapter implements Contact, Customer {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String full = String.format("%010d", data.getPhoneNumber());
            String tel1 = full.substring(0, 3);
            String tel2 = full.substring(3, 6);
            String tel3 = full.substring(6, 8);
            String tel4 = full.substring(8, 10);
            String res = "+" + data. getCountryPhoneCode() + "(" + tel1 + ")" + tel2 + "-" + tel3 + "-" + tel4;
            return res;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}
