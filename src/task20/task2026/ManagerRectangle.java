package task20.task2026;

import java.util.ArrayList;

public class ManagerRectangle {
    ArrayList<Rectangle> rectangles;

    public ManagerRectangle() {
        rectangles = new ArrayList<>();
    }

    public void addPoint(int x, int y){
        Point newPoit = new Point(x, y);
        boolean added = false;
        for(Rectangle rectangle : rectangles){
            if(rectangle.tryAddPoint(newPoit)){
                rectangle.addPoint(newPoit);
                added = true;
                break;
            }
        }

        if(!added)
            rectangles.add(new Rectangle(newPoit));
    }

    public int getRectancleCount(){
        return rectangles.size();
    }
}
