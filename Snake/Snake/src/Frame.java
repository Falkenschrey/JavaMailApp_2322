import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame extends JFrame implements KeyListener {
    public Frame(int gridGroeße, int width, int height){
        this.setTitle("Snake");
        this.setMinimumSize(new Dimension(width,height));
        this.setLayout(new GridLayout(gridGroeße,gridGroeße));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.addKeyListener(this);
        this.setBackground(Color.BLACK);
        pack();
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 40 -> //unten
                    Main.snake.setNextMove('u');
            case 39 -> //rechts
                    Main.snake.setNextMove('r');
            case 38 -> //oben
                    Main.snake.setNextMove('o');
            case 37 -> //links
                    Main.snake.setNextMove('l');
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Bei ESC Pause
    }
}
