import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class StartUp extends JFrame implements ActionListener {
    private JPanel startIpPanel;
    private JButton startButton;
    private JRadioButton leichtRadioButton;
    private JRadioButton normalRadioButton;
    private JRadioButton schwerRadioButton;
    private int geschwindigkeit;
    private JTextField textFieldSpielfeldgroe0e;
    private JTextField textFieldPixelAnzahl;

    ButtonGroup group = new ButtonGroup();
    public StartUp() {
        this.setTitle("Einstellungen");
        this.setContentPane(startIpPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        group.add(leichtRadioButton);
        group.add(normalRadioButton);
        group.add(schwerRadioButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (leichtRadioButton.isSelected()){
                    geschwindigkeit = 700;
                }
                if (normalRadioButton.isSelected()){
                    geschwindigkeit = 400;
                }
                if (schwerRadioButton.isSelected()){
                    geschwindigkeit = 250;
                }
                Main.pixelAnzahl = Main.startUp.getPixel();

                Main.generiereFenster(Main.pixelAnzahl, Main.startUp.getGroesse(), Main.startUp.getGroesse());
                Main.fixWindow();

                java.util.Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        Main.snake.moveSnake();
                    }
                }, Main.startUp.getGeschwindigkeit(), Main.startUp.getGeschwindigkeit());
                Main.startUp.setVisible(false);
            }
        });

    }
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getGroesse() {
        return Integer.parseInt(textFieldSpielfeldgroe0e.getText());
    }

    public int getPixel() {
        return Integer.parseInt(textFieldPixelAnzahl.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }
}
