class continent
{
protected String cont;
void get()
{
  cont="asia"; 
}
}
 class country extends continent
{
  protected String cname;
  void accept()
  {
  cname="India";
  } 
}
class state extends country
{
  protected String sname;
  void accept1()
  {
  sname="Maharashtra";  
} 
}
class place extends state
{
  String pname;
  void accept2()
  {
  pname="Nashik";
  } 
void show()
 {
   System.out.println("Continent is  "  +cont);
   System.out.println("Country is   "  +cname);
   System.out.println("State name   "  +sname);
   System.out.println("Place is    " +pname);
  }}
class prog2
 {
 public static void main(String args[])
  {
    place t=new place();
    t.get();
    t.accept();
    t.accept1();  
    t.accept2();
    t.show();
   } 
}
