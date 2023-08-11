// Import the packages to access the classes and methods in awt and applet classes.
import java.awt.*;
import java.applet.*;
class AppletExample extends Applet
{
// Paint method to display the message.
public void paint(Graphics g)
{
g.drawString("Hello World!",100,100);
}
}