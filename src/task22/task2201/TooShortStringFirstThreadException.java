package task22.task2201;

/**
 * Created by User on 31.08.2018.
 */
public class TooShortStringFirstThreadException extends Throwable {
    public TooShortStringFirstThreadException(StringIndexOutOfBoundsException cause) {
        super(cause);
    }
}
