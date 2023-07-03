import java.awt.*;
import java.util.Random;

public class Food {
    public Point getPosition() {
        return position;
    }

    private Point position;
    private int fensterGroeße;

    public Food(int pixelanzahl){
        this.fensterGroeße = pixelanzahl;
        generateFood();
        drawFood();
    }

    public void generateFood(){
        Random random = new Random();
        this.position = new Point(random.nextInt(Main.pixelAnzahl),random.nextInt(Main.pixelAnzahl));
        Main.snake.getVerlauf().forEach(point -> {
            if (point.y == this.position.y && point.x == this.position.x){
                generateFood();
            }
        });
    }
    public void drawFood(){
        Pixel.pixelMap[this.position.x][this.position.y].setBackground(Color.RED);
    }
    public void eatFood(){
        position = null;
        generateFood();
    }
}
