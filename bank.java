public class bank
{
	public static void main(String args[])
	{
		BankA ba=new BankA();
		ba.getBalance();

		BankB bb=new BankB();
		bb.getBalance();
	
		BankC bc=new BankC();
		bc.getBalance();

	}
}
		
abstract class Bank
{
	public abstract void getBalance();
	{
		class BankA extends Bank
		{
			public void getBalance()
		{
			System.out.println("Deposited 100");

		}
		}
		
		class BankB extends Bank
		{
			public void getBalance()
		{
			System.out.println("Deposited 150");

		}
		}

		class BankC extends Bank
		{
			public void getBalance()
		{
			System.out.println("Deposited 200");

		}
		
		}
	}
}
