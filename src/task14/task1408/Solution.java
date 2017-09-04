package task14.task1408;

/**
 * Created by User on 04.09.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if(country.equals("Ukraine"))
                hen = new UkrainianHen();
            else if (country.equals("Russia"))
                hen = new RussianHen();
            else if (country.equals("Moldova"))
                hen = new MoldovanHen();
            else if (country.equals("Belarus"))
                hen = new BelarusianHen();
            return hen;
        }
    }

}
