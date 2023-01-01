import java.io.*;
import java.util.*;

abstract class order 
{
   int id;
  String desc;
  public order(int x,String y)
  {
    id=x;
    desc=y;
   }

  abstract void display();
}
class Salesorder extends order
{
	 String cname;
	 String vname;
         
 	public Salesorder(int a,String b,String c,String d)
 	{
 		  super(a,b);
 		  cname=c;
 		  vname=d;
    }
 	void display()
    {
 	  System.out.println(id+"\t  "+desc+"\t\t"+cname+"\t\t"+vname);
    }
}
class Purchaseorder extends order
{
   	String cname;
	 String vname;
   public Purchaseorder(int p,String q,String r,String s)
   {
      	 super(p,q);
      	 cname=r;
         vname=s;
   }
   void display()
   {
     System.out.println(id+"\t  "+desc+"\t\t"+cname+"\t\t"+vname);
   }
}
class test11
{
  public static void main(String args[]) throws Exception
  {
    
   		 int i;
   		 Scanner s=new Scanner(System.in);
   		 System.out.println("Enter how many objects:");
   		 int n=s.nextInt();
   		 Salesorder[] f=new Salesorder[n];
   		 Purchaseorder[] f1=new Purchaseorder[n];
    	 System.out.println("Enter type of order:");
   		 String ch=s.next();
      if(ch.equals("Salesorder"))
    {
      for(i=0;i<n;i++)
      {
      System.out.println("Enter id:");
      int a=s.nextInt();
      System.out.println("Enter desc:");
      String b=s.next();
      System.out.println("Enter customer name:");
      String c=s.next();
      System.out.println("Enter vendor name:");
      String d=s.next();
      
      f[i]=new Salesorder(a,b,c,d);
    }
      System.out.println("id \t desc \t cname \t vname ");
      for(i=0;i<n;i++)
      f[i].display();
    }
    else
    {
      for(i=0;i<n;i++)
      {
      System.out.println("Enter id:");
      int a1=s.nextInt();
      System.out.println("Enter desc:");
      String b1=s.next();
      System.out.println("Enter customer name:");
      String c1=s.next();
      System.out.println("Enter vendor name:");
      String d1=s.next();
      f1[i]=new Purchaseorder(a1,b1,c1,d1);
      }
      System.out.println("id \t desc \t cname \t vname ");
      for(i=0;i<n;i++)
      f1[i].display();
    }
  }
}



