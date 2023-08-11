import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends MouseAdapter {
    JFrame f;

    Mouse() {
        f = new JFrame("mouse adapter");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);  // Changed from addMouseAdapter

    }

    // Use the correct method name: mousePressed
    @Override
    public void mousePressed(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.red); // Changed to setColor
        g.fillOval(e.getX(), e.getY(), 20, 30); // Changed to getX and getY
    }

    public static void main(String args[]) {
        new Mouse();
    }
}
