package task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            this.move();
            this.print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for(Horse horse : horses){
            horse.move();
        }
    }

    public void print(){
        for(Horse horse : horses){
            horse.print();
        }
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = horses.get(0);
        double max = horses.get(0).getDistance();
        for(Horse horse : horses){
            if(max < horse.getDistance()) {
                max = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<Horse>();
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
