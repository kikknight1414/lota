import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key extends KeyAdapter {
    JFrame f;
    JLabel l;
    JTextArea area;

    Key() {
        f = new JFrame("key adapter");
        l = new JLabel();
        l.setBounds(20, 70, 200, 20); // Adjusted label's position
        area = new JTextArea();
        area.setBounds(20, 20, 150, 40); // Adjusted text area's position and size
        area.addKeyListener(this); // Corrected the method name
        f.add(l);
        f.add(area);
        f.setSize(200, 150); // Adjusted frame's size
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void kr(KeyEvent e) { // Corrected the method name
        String text = area.getText();
        String words[] = text.split("\\s+"); // Escaped the backslash and corrected the regex
        l.setText("Words: " + words.length + " Characters: " + text.length());
    }

    public static void main(String args[]) {
        new Key();
    }
}
