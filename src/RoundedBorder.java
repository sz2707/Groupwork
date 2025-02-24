import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

class RoundedBorder implements Border {
    private int radius;
    RoundedBorder(int radius) {
        this.radius = radius;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius, this.radius, this.radius, this.radius);
    }
    public boolean isBorderOpaque() {
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.WHITE);
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}

