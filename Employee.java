class Employee
{
	int id,salary;
	String name;
	String city;
	Employee(int id,String name,int salary,String city)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.city=city;
	}
    public String toString()
   {
            return this.id+"\n"+this.name+"\n"+this.salary+"\n"+this.city;
   }	
	public static void main(String args[])
	{
		Employee e1=new Employee(111,"rakesh",50000,"lucknow");
		
		System.out.println("employee details"+e1);
		
	}
}