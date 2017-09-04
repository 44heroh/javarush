package task14.task1408;

/**
 * Created by User on 04.09.2017.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна — " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
