import java.io.*;
class fdemo
 {
 public static void main (String args[]) throws Exception
   {
File f1= new File("C://tyjava/files/temp1.txt");
System.out.println ("File name " +f1.getName()); 
System.out.println  ("File size " +f1.length());
System.out.println ("File Path " +f1.getPath());
System.out.println  ("Parent folder " +f1.getParent());
System.out.println (f1.exists()?  "file exists": "file not exist" );
System.out.println  (f1.isDirectory()?  "it is a directory": "it is not a directory" );
System.out.println (f1.canRead()? "it is readable": "it is not readable" );
File f2=new File("temp33.txt");
 f1.renameTo(f2);
 System.out.println (f1.getName());
  }}
