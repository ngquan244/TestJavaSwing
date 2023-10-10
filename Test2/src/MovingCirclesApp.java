import javax.swing.*;

public class MovingCirclesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Moving Circles Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MovingCirclesPanel movingCirclesPanel = new MovingCirclesPanel();
            frame.add(movingCirclesPanel);

            Timer timer = new Timer(20, e -> movingCirclesPanel.moveCircles(frame.getWidth(), frame.getHeight()));
            timer.start();

            frame.setVisible(true);
        });
    }
}