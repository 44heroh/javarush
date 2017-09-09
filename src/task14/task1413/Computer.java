package task14.task1413;

/**
 * Created by User on 09.09.2017.
 */
class Computer {
    private Keyboard Keyboard;
    private Mouse Mouse;
    private Monitor Monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor){
        this.Keyboard = keyboard;
        this.Mouse = mouse;
        this.Monitor = monitor;

    }

    public Keyboard getKeyboard() {
        return this.Keyboard;
    }

    public Mouse getMouse() {
        return this.Mouse;
    }

    public Monitor getMonitor() {
        return this.Monitor;
    }
}
