
 class MyNo 
 {
         private  int a;
  MyNo()
  {
  	a=0;
  }
  MyNo(int a)
  {
  	this.a=a;
  }
  public void isPositive()
  {
   if(a>0)
    System.out.println("The no is Positive");
  }  
 public void isNegative()
  {
   if(a<0)
    System.out.println("The no is Negative");
  }   
 public void iseven()
  {
   if(a%2==0)
    System.out.println("The no is even");
  } 
 public void isOdd()
  {
   if(a%2!=0)
    System.out.println("The no is Odd");
  }
 public void isZero()                                                     
 {
   if(a==0)
  
    System.out.println("The No is Zero ");
  else
    System.out.println("The no is not zero");
  }
 public static void main(String args[])
 {
   int a1=Integer.parseInt(args[0]);
  MyNo m=new MyNo();
  MyNo m1=new MyNo(a1);
 
  m1.isPositive();
  m1.isNegative();
  m1.iseven();
  m1.isOdd();
  m1.isZero();
 }
}