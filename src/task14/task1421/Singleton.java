package task14.task1421;

/**
 * Created by User on 09.09.2017.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
        this.instance = this;
    }

    public static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
}
