import java.util.*;
public class Main
{
interface operation
{
public int cube();
}
static class number implements operation
{
int num;
number(int num)
{
this.num = num;
}
public int cube()
{
return (num * num * num);
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number:");
int num = sc.nextInt();
number n1 = new number(num);
System.out.println("cube of " + num + " is " + n1.cube());
}
}