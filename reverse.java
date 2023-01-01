import java.io.*;
class reverse
 {
public static void main (String args[]) throws Exception
   {
RandomAccessFile f=new RandomAccessFile("data17.txt", "r");

for(long i=f.length()-1;i>=0;i--)
  {
        System.out.print((char)f.read());
       f.seek(i);
   }
f.close();
}
 
}