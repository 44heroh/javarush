package task14.task1408;

/**
 * Created by User on 04.09.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    public String getDescription(){
        return super.getDescription() + "Моя страна — " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
