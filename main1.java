import java.io.*;
import java.util.*;
interface Operation
 {
float pi = 3.14f;
void area(float r, float h);
void volume(float r, float h);
}
class Cylinder implements Operation 
{
public void area(float r, float h)
 {
System.out.print("\nArea of the cylinder is: " + (2 * r * pi * (r + h)));
}
public void volume(float r, float h)
 {
System.out.println("\n\nVolume of the cylinder is: " + (pi * r * r * h) + "\n");
}
}
class main1
 {
public static void main(String args[])
 {
int r, h;
Cylinder ob = new Cylinder();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the radius of the cylinder: ");
r = sc.nextInt();
System.out.print("Enter the height of the cylinder: ");
h = sc.nextInt();
ob.area(r, h);
ob.volume(r, h);
}
}