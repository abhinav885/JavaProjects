package encapsulation;
class Account8
{
	int accNo;
	String holderName;
	double balance;
	
	public Account8()
	{
		this(2,"unknown");
	}
	
	public Account8(int accNo,String holderName)
	{
		this(accNo,holderName,1000);
	}
	
	public Account8(int accNo,String holderName,int balance)
	{
		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	void deposit(double amount)
	{
		balance = balance+amount;
	}
	
	void Withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance = balance-amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	void display()
	{
		System.out.println("Account Number: "+accNo);
		System.out.println("HolderName: "+holderName);
		System.out.println("Balance: "+balance);
	}
	
}
public class BankAccount2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account8 ac = new Account8();
		Account8 ac1 = new Account8(101,"Abhishek");
		Account8 ac2 = new Account8(105,"Anandhu",25000);
		ac1.deposit(5000);
		ac1.Withdraw(600);
		
		ac2.deposit(50000);
		ac2.Withdraw(500);
		
		ac.display();
		System.out.println();
		
		ac1.display();
		System.out.println();
		
		ac2.display();
		System.out.println();
	}

}
