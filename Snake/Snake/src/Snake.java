import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    //Points benutzen um die Schlange zeichnen zu können
    private List<Point> verlauf = new ArrayList<>();
    private char nextMove;
    private char actuallMove;
    private Point head;
    private int snakeLaenge = 0;

    public Snake(Point start){
        this.verlauf.add(start);
        this.actuallMove = 'u';
        this.nextMove = 'u';
        this.drawSnake();
    }

    public void moveSnake(){
        try {
            if (Main.food.getPosition().x == verlauf.get(verlauf.size()-1).x && Main.food.getPosition().y == verlauf.get(verlauf.size()-1).y){
                snakeLaenge++;
                Main.food.eatFood();
            }
            switch (nextMove){
                case 'u':
                    head = new Point(verlauf.get(verlauf.size()-1).x,verlauf.get(verlauf.size()-1).y+1);
                    verlauf.add(new Point(verlauf.get(verlauf.size()-1).x,verlauf.get(verlauf.size()-1).y+1));
                    break;
                case 'r':
                    head = new Point(verlauf.get(verlauf.size()-1).x+1,verlauf.get(verlauf.size()-1).y);
                    verlauf.add(new Point(verlauf.get(verlauf.size()-1).x+1,verlauf.get(verlauf.size()-1).y));
                    break;
                case 'o':
                    head = new Point(verlauf.get(verlauf.size()-1).x,verlauf.get(verlauf.size()-1).y-1);
                    verlauf.add(new Point(verlauf.get(verlauf.size()-1).x,verlauf.get(verlauf.size()-1).y-1));
                    break;
                case 'l':
                    head = new Point(verlauf.get(verlauf.size()-1).x-1,verlauf.get(verlauf.size()-1).y);
                    verlauf.add(new Point(verlauf.get(verlauf.size()-1).x-1,verlauf.get(verlauf.size()-1).y));
                    break;
            }
            this.drawSnake();
        } catch (Exception e){
            JOptionPane.showMessageDialog(Main.gameframe,"Game Over!","",JOptionPane.DEFAULT_OPTION);
            System.exit(-1);
        }
    }
    private void drawSnake(){
        Pixel.pixelMap[0][0].flushWindow();
        if (Main.food != null){
            Main.food.drawFood();
        }
        for (int i = 0; i <= snakeLaenge; i++) {
            Pixel.pixelMap[verlauf.get((verlauf.size()-1)-i).x][verlauf.get((verlauf.size()-1)-i).y].setBackground(Color.GREEN);
        }
        if (head != null){
            Pixel.pixelMap[head.x][head.y].setBackground(new Color(23, 205, 18, 242));
        }
    }
    public List<Point> getVerlauf() {
        return verlauf;
    }
    public void setNextMove(char nextMove) {
        switch (nextMove){
            case 'u':
                if (actuallMove != 'o'){
                    this.actuallMove = nextMove;
                    this.nextMove = nextMove;
                }
                break;
            case 'r':
                if (actuallMove != 'l'){
                    this.actuallMove = nextMove;
                    this.nextMove = nextMove;
                }
                break;
            case 'o':
                if (actuallMove != 'u'){
                    this.actuallMove = nextMove;
                    this.nextMove = nextMove;
                }
                break;
            case 'l':
                if (actuallMove != 'r'){
                    this.actuallMove = nextMove;
                    this.nextMove = nextMove;
                }
                break;
        }
    }
}
