package task22.task2201;

/**
 * Created by User on 31.08.2018.
 */
public class TooShortStringSecondThreadException extends Throwable {
    public TooShortStringSecondThreadException(StringIndexOutOfBoundsException cause) {
        super(cause);
    }
}
