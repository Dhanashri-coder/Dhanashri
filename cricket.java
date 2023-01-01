import java.io.*;
class cricket
  {
    static String name[]=new String[10],nm;
    static int inngs[]=new int[10],notout[]=new int[10],runs[]=new int[10],r,in,n;
    static double avg[]=new double[10],p;


    void get(int i) throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        {
          r=i+1;
          System.out.println("Enter the details of "+r+" player:");
          try
           {
             System.out.println("Enter the name:");
             name[i]=br.readLine();
             System.out.println("Enter the no of innings:");
             inngs[i]=Integer.parseInt(br.readLine());
             System.out.println("Enter the no of times not out:");
             notout[i]=Integer.parseInt(br.readLine());
             System.out.println("Enter the total runs:");
             runs[i]=Integer.parseInt(br.readLine());
             avg[i]=batavg(i);
           }
          catch(NumberFormatException e)
           {
             System.out.println("Invalid input");
           }
        }
     }
   static double batavg(int i)
     {
       p=inngs[i]+notout[i];
       return(p);
     }
   static void show()
        {
          System.out.println(" The sorted list is on the basis of average: ");
          System.out.println("Player_name  No_of_innings  No_of_times_Notout  Total_Runs  Batting_average");
          for(int i=0;i<n;i++)
             System.out.println(name[i]+"\t\t"+inngs[i]+"\t\t"+notout[i]+"\t\t  "+runs[i]+"\t\t"+avg[i]); 
        }    
    static void sort()
        {
           for(int j=0;j<n;j++)
             {
               for(int i=j+1;i<n;i++)
                 {
                   if(avg[j] > avg[i])
                     {
                       p=avg[j];
                       avg[j]=avg[i];
                       avg[i]=p;
                       nm=name[j];
                       name[j]=name[i];
                       name[i]=nm;
                       r=notout[j];
                       notout[j]=notout[i];
                       notout[i]=r;
                       in=inngs[j];
                       inngs[j]=inngs[i];
                       inngs[i]=in;
                       r=runs[j];
                       runs[j]=runs[i];
                       runs[i]=r;

                     }
                  }
              }
          }     
  public static void main(String args[])  throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        cricket[] c=new cricket[10];
        System.out.println("Enter the how many cricket player details you want: ");
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
         {
           c[i]=new cricket();
           c[i].get(i);
         }
       sort();
       show();
     }
   }
   


