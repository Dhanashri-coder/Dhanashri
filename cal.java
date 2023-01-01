import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements ActionListener
 {
   JPanel p1;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
   JTextField t1; 
   String s1="",s2="",s3="",a; 
  myframe()
   {
    super(" Simple Calculator ");
    p1=new JPanel();
    t1=new JTextField(50);
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("+");
    b5=new JButton("4");
    b6=new JButton("5");
    b7=new JButton("6");
    b8=new JButton("-");
    b9=new JButton("7");
    b10=new JButton("8");
    b11=new JButton("9");
    b12=new JButton("*");
    b13=new JButton("0");
    b14=new JButton(".");
    b15=new JButton("=");
    b16=new JButton("/");
    
    Container c1=getContentPane();
    c1.setLayout(null);
    p1.setLayout(new GridLayout(4,4,3,3));
    
    t1.setBounds(500,100,250,50);
    p1.setBounds(500,160,250,250); 
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);    
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
             
    c1.add(t1);
    c1.add(p1);
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(b10);
    p1.add(b11);
    p1.add(b12);
    p1.add(b13);
    p1.add(b14);
    p1.add(b15);
    p1.add(b16);   
      
    setSize(1000,1000);
    setVisible(true);
   }
  public void actionPerformed(ActionEvent a1)
    {
      
      if(a1.getSource()==b1 || a1.getSource()==b2||a1.getSource()==b3|| a1.getSource()==b5|| a1.getSource()==b6 || a1.getSource()==b7||a1.getSource()==b9 || a1.getSource()==b10|| a1.getSource()==b11 || a1.getSource()==b13 || a1.getSource()==b14)
       {
          t1.setText(t1.getText()+""+a1.getActionCommand());
       //  t1.setText(t1.getText());
       
         s1=t1.getText();
       } 
      else  
      if(a1.getSource()==b4 || a1.getSource()==b8|| a1.getSource()==b12|| a1.getSource()==b16)
       {
         s2=t1.getText();
         a=a1.getActionCommand();
        t1.setText(a1.getActionCommand()); 
    	t1.setText("");
       } 
      else 
      if(a1.getSource()==b15)
       {
        t1.setText("");
        int x=Integer.parseInt(s2);
       	int y=Integer.parseInt(s1);
        if(a.equals("+"))
       	 {
       	   
       	   t1.setText(String.valueOf(x+y));
         }
        if(a.equals("-"))
       	 {
       	  
       	   t1.setText(String.valueOf(x-y));
         }
        if(a.equals("*"))
       	 {
       	 
       	   t1.setText(String.valueOf(x*y));
         } 
        if(a.equals("/"))
       	 {
       	  
       	   t1.setText(String.valueOf(x/y));
         }  
      }
       	 	 
    }             
  } 
 class cal
 {
   public static void main(String args[])
     {
       new myframe();
     }
 }
