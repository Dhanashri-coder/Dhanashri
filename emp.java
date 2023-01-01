import java.io.*;
class emp
 {
 int id;
 String name,dept;
float sal;
 static int count=0;
 public emp()
{
  id=0;
  name=null;
dept=null;
  sal=0.0f;
 }
 public emp(int id,String name,String dept,float sal)
{
  this.id=id;
  this.name=name;
this.dept=dept;
  this.sal=sal;
  count++;
 }
 public static void count()
{
  System.out.println("Object "+(count)+" Created");
 }
 public void display()
{
  System.out.println("emp id: "+id);
  System.out.println("Name: "+name);
   System.out.println("department: "+dept);
  System.out.println("salary: "+sal);
  System.out.println("------------------------------");
 } 

 public static void main(String [] args)
{
  emp s1=new emp(1,"tusher","computer",15000.00f);
  emp.count();
    emp s2=new emp(2,"abc","eletronics",25000.00f);
  emp.count();
  emp s3=new emp(3,"pranav","IT",25000.00f);
  emp.count();
  s1.display();
  s2.display();
  s3.display();  
}

}