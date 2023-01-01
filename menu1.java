import java.awt.*;
import javax.swing.*;

class myframe extends JFrame 
  {
    JMenuBar mb1;
    JMenu m1,m2,m3,m11,m31;
    JCheckBoxMenuItem cb1,cb2,cb3;
    JMenuItem m12,m14,m111,m112,m21,m22,m13,m32;    
   myframe() 
     {
       mb1=new JMenuBar();
       m1=new JMenu("File");
       m2=new JMenu("Edit");
       m3=new JMenu("View");
       m11=new JMenu("New");
       m12=new JMenuItem("Open");
       m13=new JMenuItem("Save");
       m14=new JMenuItem("Exit");
       m111=new JMenuItem("File");
       m112=new JMenuItem("Folder");
       m21=new JMenuItem("Cut");
       m22=new JMenuItem("Paste");
       m31=new JMenu("Ruler");
       m32=new JMenuItem("Toolbars");
       cb1=new JCheckBoxMenuItem("Standard"); 
       cb2=new JCheckBoxMenuItem("Format"); 
       cb3=new JCheckBoxMenuItem("Drawing"); 

       add(mb1);
       mb1.add(m1);
       mb1.add(m2);
       mb1.add(m3);
       m1.add(m11);
       m1.add(m12);
       m1.add(m13);
       m1.addSeparator();
       m1.add(m14);
       m2.add(m21);
       m2.add(m22);
       m3.add(m31); 
       m3.add(m32);
       m11.add(m111);
       m11.add(m112);
       m31.add(cb1);
       m31.add(cb2);
       m31.add(cb3);  
 
        
       setJMenuBar(mb1);
       setSize(500,500);
       setVisible(true);
    }
}
class menu1
 {
   public static void main(String args[])
     {
       new myframe();
     }
 }
