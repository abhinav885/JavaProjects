package encapsulation;

class BankAccount1
{
	private long balance;

	public void setData(long amt)
	{
		if(amt>=0)
		{
			balance = amt;
		}
		else
		{
			System.out.println("Invalid Amount");
			System.exit(0);
		}
	}
	
	public long getData()
	{
		return balance;
	}
}
	public class BankAccount
	{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount1 ba = new BankAccount1();
		//ba.balance = 1000000;
		//System.out.println(ba.balance);
		
		ba.setData(1000);
		System.out.println(ba.getData());
	}
}



