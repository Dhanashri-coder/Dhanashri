import java.io.*;
class item
 {
 int id;
 String name;
float price;
 static int count=0;
 public item()
{
  id=0;
  name=null;
  price=0.0f;
 }
 public item(int id,String name,float price)
{
  this.id=id;
  this.name=name;
  this.price=price;
  count++;
 }
 public static void count()
{
  System.out.println("Object "+(count)+" Created");
 }
 public void display()
{
  System.out.println("item id: "+id);
  System.out.println("Name: "+name);
  System.out.println("price: "+price);
  System.out.println("------------------------------");
 } 

 public static void main(String [] args)
{
 item s1=new item(11,"pen",15.00f);
  item.count();
   item s2=new item(12,"pencil",25.00f);
  item.count();
  item s3=new item(13,"eraser",10.00f);
  item.count();
  s1.display();
  s2.display();
  s3.display();  
}

}