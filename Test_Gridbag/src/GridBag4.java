import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBag4 extends JPanel {
    GridBagConstraints constraints = new GridBagConstraints();

    public GridBag4() {
        setLayout(new GridBagLayout());
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        int x, y; // for clarity
        constraints.weightx = 0.1;
        addGB(new JButton("one"), x = 0, y = 0);
        constraints.weightx = 0.5;
        addGB(new JButton("two"), ++x, y);
        constraints.weightx = 1.0;
        addGB(new JButton("three"), ++x, y);
    }

    void addGB(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        add(component, constraints);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLocation(200, 200);
        frame.setContentPane(new GridBag4());
        frame.setVisible(true);
    }
}