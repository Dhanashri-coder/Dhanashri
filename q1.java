import java.io.*;
class q1
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rollno:");
		int rollno=Integer.parseInt(br.readLine());
		System.out.println("Enter the name:");
		String name=br.readLine();
		System.out.println("Enter the class:");
		String class1=br.readLine();
		System.out.println("Enter the Percentage:");
		float per=Float.parseFloat(br.readLine());
		System.out.println("----------------------------------");
		System.out.println("Student name: "+name+"Student Rollno: "+rollno+"Student Class: "+class1+"Student Percentage: "+per);
	}
}
		
		
			