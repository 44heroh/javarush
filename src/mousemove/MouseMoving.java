package mousemove;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseMoving {

    public static void main(String[] args) {
        new MouseMoving().execute();
    }

    public void execute() {
        //Разрешение экрана
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
        int x = sSize.width - 130;
        new Thread( new MouseMoveThread( x, 10, 50, 10 ) ).start();
    }

    private class MouseMoveThread implements Runnable {

        private Robot robot;
        private int startX;
        private int startY;
        private int currentX;
        private int currentY;
        private int xAmount;
        private int yAmount;
        private int xAmountPerIteration;
        private int yAmountPerIteration;
        private int numberOfIterations;
        private long timeToSleep;

        public MouseMoveThread( int xAmount, int yAmount, int numberOfIterations, long timeToSleep ) {

            this.xAmount = xAmount;
            this.yAmount = yAmount;
            this.numberOfIterations = numberOfIterations;
            this.timeToSleep = timeToSleep;

            try {

                robot = new Robot();

                Point startLocation = MouseInfo.getPointerInfo().getLocation();
                startX = startLocation.x;
                startY = startLocation.y;
                //Разрешение экрана
                Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
                startX = 0;
                startY = 0;
                System.out.println(" X = " + startX + " Y = " + startY);


            } catch ( AWTException exc ) {
                exc.printStackTrace();
            }

        }

        @Override
        public void run() {

            currentX = startX;
            currentY = startY;

            xAmountPerIteration = xAmount / numberOfIterations;
            yAmountPerIteration = yAmount / numberOfIterations;

            while ( currentX < startX + xAmount &&
                    currentY < startY + yAmount ) {

                currentX += xAmountPerIteration;
                currentY += yAmountPerIteration;

                robot.mouseMove( currentX, currentY );

                try {
                    Thread.sleep( timeToSleep );
                } catch ( InterruptedException exc ) {
                    exc.printStackTrace();
                }

            }
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }

    }

}
