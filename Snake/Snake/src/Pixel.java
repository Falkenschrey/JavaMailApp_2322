import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Pixel extends JPanel {

    public static Pixel[][] pixelMap;

    public Pixel(){
        this.setBackground(Color.darkGray);
        this.setBorder(BorderFactory.createEtchedBorder());
    }

    public void flushWindow(){
        for (int i = 0; i < pixelMap.length; i++) {
            for (int j = 0; j < pixelMap[i].length; j++) {
                pixelMap[i][j].setBackground(Color.DARK_GRAY);
            }
        }
    }
}
