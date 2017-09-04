package task14.task1408;

/**
 * Created by User on 04.09.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 45;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна — " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
