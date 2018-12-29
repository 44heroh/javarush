package task20.task2026;

import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Point> points;

    public Rectangle(Point point) {
        points = new ArrayList<>();
        points.add(point);
    }

    public boolean tryAddPoint(Point point) {
        boolean added = false;
        boolean firstAdded = false;
        for(Point currentPoint : points){
            if(point.isNear(currentPoint)){
                added = true;
                firstAdded = true;
                break;
            }
        }
        return firstAdded;
    }

    public void addPoint(Point point){
        boolean added = false;
        for(Point currentPoint : points){
            if(point.isNear(currentPoint)){
                points.add(point);
                break;
            }
        }
    }
}
