import java.awt.*;

import java.awt.event.*;
public class border extends Frame
{
	Button b1,b2,b3,b4;
	TextField t1;
Frame f;
	public  border()
	{
		f=new Frame();
                                   f.setSize(250,250);
                               f.setVisible(true);
                               f.setLayout(new BorderLayout());
		b1=new Button("B1");
		b2=new Button("B2");
		b3=new Button("B3");
		b4=new Button("B1");
		t1=new TextField(30);
		f.add("North",b1);
		f.add("South",b2);
		f.add("East",b3);
		f.add("West",b4);
		f.add("Center",t1);
		
	}
	
public static void main(String args[])
  {
  border t=new border();         

  }
}