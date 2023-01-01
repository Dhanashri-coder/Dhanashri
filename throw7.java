
import java.io.*;
class invalidpass extends Exception
{
	invalidpass(String msg)
	{
		super(msg);
	}
}
class throw7
{
    public static void main(String args[]) throws Exception
    {
          
         try
         {
             BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter user name:");
	String uname=d.readLine();
    System.out.println("Enter password:");
	String pwd=d.readLine();
	if((uname.equals(pwd)))
	    System.out.println("user name is "+uname+"  password is "+pwd);
	else
	     throw new invalidpass("invalid password");
         }catch(invalidpass e)
          {
       	System.out.println(e.getMessage());
          }
	
    }
}
