package task22.task2213;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        this.sections = new ArrayList();
        SnakeSection head =  new SnakeSection(x, y);
        this.sections.add(head);
        this.isAlive = true;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void checkBorders(SnakeSection head){
        if (head.getX() < 0)
            isAlive = false;
        if (head.getX() >= Room.game.getWidth())
            isAlive = false;
        if (head.getY() < 0)
            isAlive = false;
        if (head.getY() >= Room.game.getHeight())
            isAlive = false;
    }

    public void checkBody(SnakeSection head){
        if(sections.contains(head)){
            isAlive = false;
        }
    }

    public void move(){
        if(isAlive()){
            if(direction == SnakeDirection.UP){
                move(0, -1);
            } else if(direction == SnakeDirection.RIGHT){
                move(1, 0);
            } else if(direction == SnakeDirection.DOWN){
                move(0, 1);
            } else if(direction == SnakeDirection.LEFT){
                move(-1, 0);
            }
        }
    }

    public void move(int dx, int dy){
        //Создаем голову змеи
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX() + dx, head.getY() + dy);

        //Проверяем - не вылезла ли голова за границу комнаты
        checkBorders(head);
        if(!isAlive) return;

        //Проверяем - не пересекает ли змея  саму себя
        checkBody(head);
        if(!isAlive) return;

        Mouse mouse = Room.game.getMouse();

        if(head.getX() == mouse.getX() && head.getY() == mouse.getY()){
            //съела
            sections.add(0, head);  //Добавили новую голову
            Room.game.eatMouse(); //Хвот не удаляем, но создаем новую мышь.
        } else {
            // просто движется
            sections.add(0, head);
            sections.remove(sections.size() - 1);
        }
    }
}
