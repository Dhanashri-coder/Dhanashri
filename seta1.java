import java.io.*;
class positive extends Exception
{
       positive(String msg)
      {
           super(msg);
     }
}
class patient 
{
     String pname;
   int page,hrct;
  float olevel;
     void get(String pnm,int age,int h,float o)
      {
             pname=pnm;
             page=age;
             hrct=h;
             olevel=o;
      }
   void display()
     {
      try
{
    if(olevel<95.00 && hrct>10)
     throw new positive("patient is covid +ve and needs to hosptaliesd");
  else
     {
             System.out.println("patient name"+pname);
             System.out.println("patient age"+page);
            System.out.println("oxygen level of patient"+olevel);
           System.out.println("hrct level"+hrct);

       }

  }catch(positive e)
  {
      System.out.println(e.getMessage());
  }
     }

}
class seta1
{
    public static void main(String args[])throws Exception
   {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter patient name and age");
  String pnm=br.readLine();
  int age=Integer.parseInt(br.readLine());
   System.out.println("Enter patient oxygen level and hrct");
    float o=Float.parseFloat(br.readLine());
    int h=Integer.parseInt(br.readLine());
patient t=new patient();
   t.get(pnm,age,h,o);
   t.display();

   }

}