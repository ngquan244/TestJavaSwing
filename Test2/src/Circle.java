import java.awt.*;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    public Circle(int x, int y, int radius, Color color, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public void move(int panelWidth, int panelHeight) {
        x += xSpeed;
        y += ySpeed;

        if (x - radius <= 0 || x + radius >= panelWidth) {
            xSpeed = -xSpeed;
        }
        if (y - radius <= 0 || y + radius >= panelHeight) {
            ySpeed = -ySpeed;
        }
    }
}