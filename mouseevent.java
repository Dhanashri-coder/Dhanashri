import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JApplet;
public class mouseevnts extends JApplet implements MouseListener
{
private int x,y;
private String event;
public void init()
{
setLayout(new FlowLayout());
x=-1;
addMouseListener(this);
}
public void paint(Graphics g)
{
super.paint(g);
g.drawRect(0,0,getWidth(),getHeight());
if(x!=1)
{
g.drawString("Mouseevent is"+event+"("+x+","+y+")", 10,50);
}
}
public void mousePressed(MouseEvent e)
{
x=e.getX();
y=e.getY();
event="pressed";
repaint();
}
public void mouseClicked(MouseEvent e)
{
x=e.getX();
y=e.getY();
event="clicked";
repaint();
}
public void mouseReleased(MouseEvent e)
{
x=e.getX();
y=e.getY();
event="Reeleased";
repaint();
}
public void mouseExited(MouseEvent e)
{
x=e.getX();
y=e.getY();
event="Exited";
repaint();
}

public void mouseEntered(MouseEvent e)
{
x=e.getX();
y=e.getY();
event="Entered";
repaint();
}
}