package task20.task2026;

public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isNear(Point point){
        if(point.x == x - 1 && point.y == y){
            return true;
        }
        if(point.x == x + 1 && point.y == y){
            return true;
        }
        if(point.y == y - 1 && point.x == x){
            return true;
        }
        if(point.y == y + 1 && point.x == x){
            return true;
        }
        return false;
    }
}
