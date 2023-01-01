import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class set1ex2 extends JFrame implements ActionListener,ItemListener
{
  String str;
 JLabel l1,l2,l3,lo;
 JButton op;
 JRadioButton b1,b2,b3;
 JTextField t1,disp;
 JCheckBox j1,j2,j3;
 ButtonGroup bg;
 set1ex2(String title)
 {
  super(title);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(null);
  bg=new ButtonGroup();
  l1=new JLabel("Your Name:");
  l1.setBounds(5,20,100,20);
   add(l1);
  t1=new JTextField(25);
  t1.setBounds(120,20,150,20);
  add(t1);
  lo=new JLabel("OutPut  :");
  lo.setBounds(10,200,50,20);
  add(lo);
  disp=new JTextField(25);
  disp.setBounds(70,200,150,20);
  add(disp);
  l2=new JLabel("Your Class");
  l2.setBounds(5,50,100,20);
  add(l2);
  l3=new JLabel("Your Hobies");
  l3.setBounds(120,50,100,20);
  add(l3);
   b1=new JRadioButton("FY");
   b2=new JRadioButton("SY");
   b3=new JRadioButton("TY");
  b1.setBounds(20,80,40,20);
  b2.setBounds(20,110,40,20);
  b3.setBounds(20,140,40,20);
  bg.add(b1);
  bg.add(b2);
  bg.add(b3);
  add(b1);
  b1.addActionListener(this);
  add(b2);
  b2.addActionListener(this);
  add(b3);
  b3.addActionListener(this);
  j1=new JCheckBox("Music");
  j2=new JCheckBox("Dances");
  j3=new JCheckBox("Sports");
  j1.setBounds(100,80,80,20);
  j2.setBounds(100,110,80,20);
  j3.setBounds(100,140,80,20);
  add(j1);
  add(j2);
  add(j3);
  j1.addItemListener(this);
  j2.addItemListener(this);
  j3.addItemListener(this);
  setVisible(true);
  setSize(500,500);
  	
 }
 public void actionPerformed(ActionEvent ae)
 {
 	disp.setText("  "+ae.getActionCommand());
 }
 public void itemStateChanged(ItemEvent ie)
 {
    if(ie.getSource()==j1)
   {
   		disp.setText(t1.getText()+" "+disp.getText()+" "+j1.getText());
   }
    if(ie.getSource()==j2)
   {
   		disp.setText(t1.getText()+" "+disp.getText()+" "+j2.getText());
   }
    if(ie.getSource()==j3)
   {
   		disp.setText(t1.getText()+" "+disp.getText()+" "+j3.getText());
   }
 }
 public static void main(String args[])
 { 
  set1ex2 l=new set1ex2("Frame Demo");
 }
}
