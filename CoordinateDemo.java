import java.awt.*;

import java.awt.event.*;

class CoordinateDemo implements MouseMotionListener
{
Frame f;Panel p;Label l1,l2;

TextField t1,t2;

public CoordinateDemo()
{
f=new Frame();
f.setSize(400,400);
f.addMouseMotionListener(this);
p=new Panel();l1=new Label("X");
l2=new Label("Y");
t1=new TextField(5);
t2=new TextField(5);
p.add(l1);p.add(t1);
p.add(l2);
p.add(t2);
f.add(p,"South");
f.setVisible(true);
}
public void mouseMoved(MouseEvent e)
{
int x,y;
x=e.getX();y=e.getY();
t1.setText(x+"");t2.setText(y+"");
}
public void mouseDragged(MouseEvent e1)
{
}
public static void main(String args[])
{
CoordinateDemo d=new CoordinateDemo();
}
}