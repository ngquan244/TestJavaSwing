import javax.swing.*;
import java.awt.*;

public class MovingCirclesPanel extends JPanel {
    private Circle[] circles;

    public MovingCirclesPanel() {
        circles = new Circle[]{
                new Circle(50, 50, 30, Color.RED, 5, 5),
                new Circle(150, 100, 20, Color.BLUE, 7, 3),
                new Circle(250, 150, 40, Color.GREEN, 3, 7)
        };
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Circle circle : circles) {
            circle.draw(g);
        }
    }

    public void moveCircles(int panelWidth, int panelHeight) {
        for (Circle circle : circles) {
            circle.move(panelWidth, panelHeight);
        }
        repaint();
    }
}