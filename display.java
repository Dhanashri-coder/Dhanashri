import java.io.*;
class display
 {
public static void main(String args[]) throws Exception
   {
FileInputStream f1=new FileInputStream("temp1.txt");
 int n;
System.out.println("Total bytes available in file" +f1.available());
while((n=f1.read())!=-1)
{
  System.out.print((char)n);
 
}
 f1.close();
}}
