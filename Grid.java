import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Grid
{
JFrame f;
Grid()
{
f=new JFrame("Grid Layout");
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.setLayout(new GridLayout(2,2));
f.setSize(600,600);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
new Grid();
}
}