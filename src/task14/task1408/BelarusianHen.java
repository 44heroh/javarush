package task14.task1408;

/**
 * Created by User on 04.09.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна — " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
