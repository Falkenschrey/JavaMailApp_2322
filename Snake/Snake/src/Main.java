import javax.swing.*;
import java.util.TimerTask;
import java.awt.*;
import java.util.Timer;

public class Main {

    static Snake snake;
    static Food food;
    static int pixelAnzahl;
    static Frame gameframe;
    static StartUp startUp;
    public static void main(String[] args) {
        startUp = new StartUp();
    }

    static void fixWindow(){
        gameframe.setSize(startUp.getGroesse()+1,startUp.getGroesse()+1);
        gameframe.setSize(startUp.getGroesse(),startUp.getGroesse());
    }
    static void generiereFenster(int pixelAnzahl, int width, int height){
        Pixel.pixelMap = new Pixel[pixelAnzahl][pixelAnzahl];
        gameframe = new Frame(pixelAnzahl, width, height);

        for (int y = 0; y < pixelAnzahl; y++) {
            for (int x = 0; x < pixelAnzahl; x++) {
                Pixel pixel = new Pixel();
                JPanel wrapper = new JPanel();
                wrapper.add(pixel);
                Pixel.pixelMap[x][y] = pixel;
                gameframe.add(pixel);
            }
        }
        snake = new Snake(new Point(0,0));
        food = new Food(pixelAnzahl);
    }
}
