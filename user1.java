import java.io.*;
class zerono extends Exception
{
    zerono(String msg)
     {

    super(msg);
    }

}
class user1
{
   public static void main(String args[])throws Exception
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try
     {
  System.out.println("Enter number");
int n=Integer.parseInt(br.readLine());
   if(n==0)
  throw new zerono("number is zero");
    else
     {   
               int i=1,c=0;
                while(i<=n)
                       {
                                 if (n%i==0)
                                    {
                                       c++;
                                      }
		i++;
                     }
if(c==2)
   System.out.println("given number is prime");
else
System.out.println("not prime");

       }

   }catch(zerono e)
    { 
    System.out.println(e.getMessage());
    }
  }

}