import java.io.*;
import java.util.*;

abstract class staff
{
  int id;
String name;
  public staff(int x,String y)
  {
    id=x;
    name=y;
       }

  abstract void display();
}
class officestaff extends staff
{
	 String dep;
 	public officestaff(int a,String b,String c)
 	{
 		  super(a,b);
 		  dep=c;
 		  
    }
 	void display()
    {
 	  System.out.println(id+"\t  "+name+"\t\t"+dep);
    }
}
class test
{
  public static void main(String args[]) throws Exception
  {
    
   		 int i;
   		 Scanner s=new Scanner(System.in);
   		 System.out.println("Enter how many objects:");
   		 int n=s.nextInt();
   		 officestaff[] f=new officestaff[n];
       for(i=0;i<n;i++)
      {
      System.out.println("Enter id:");
       int a=s.nextInt();
      System.out.println("Enter name:");
      String b=s.next();
      System.out.println("Enter department:");
      String c=s.next();
      
      f[i]=new officestaff(a,b,c);
    }
      System.out.println("id \t Name \t Depart");
      for(i=0;i<n;i++)
      f[i].display();
    }
    
      
	
    }
  


